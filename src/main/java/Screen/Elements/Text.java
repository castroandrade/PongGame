package Screen.Elements;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Text {
    public String text;
    public Font font;
    public double x, y;

    public Text(String text, Font font, double x, double y) {
        this.font = font;
        this.text = text;
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.drawString(text, (float) x, (float) y);
    }
}
