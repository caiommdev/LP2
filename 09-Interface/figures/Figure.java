package figures;

import java.awt.Graphics;
import ivisible.IVisible;

public abstract class Figure implements IVisible {
    public int x,y;
    public int w,h;
    public int r, g, b;
    
    public Figure(int x, int y, int r, int g, int b, int w, int h) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.w = w;
        this.h = h;
    }

    public void drag(int dx, int dy) { // função par arrastar as figuras
        this.x += dx;
        this.y += dy;
    }

    public boolean clicked (int x, int y) { //função para dectar quando o mouse clicar na figura
        return (this.x <= x && x<= this.x + this.w && this.y <= y && y <= this.y + this.h);
    } 
    
    public abstract void paint (Graphics g); //função par desenhar as figuras da tela
    
    public abstract void focusRef (Graphics g); // função para definir o foco da figura
}
