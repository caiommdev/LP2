package figures;

import java.awt.*;

public class Rect extends Figure{
    int r2, g2, b2;
    private Figure figure;
    
    public Rect (int x, int y, int w, int h, int r, int g, int b, int r2, int g2, int b2) {
        super(x, y, r, g, b, w,h);
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.setColor(new Color(this.r,this.g,this.b));
        g2d.fillRect(this.x, this.y, this.w, this.h);

        g2d.setColor(new Color(this.r2,this.g2,this.b2));
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }
    public boolean clicked (int x, int y) {
        return (this.x <= x && x<= this.x + this.w && this.y <= y && y <= this.y + this.h);
    }
    
}