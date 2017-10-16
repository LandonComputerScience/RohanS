/**
 * Represents a balloon in the Balloon.RoundBalloon program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.*;

public class FancyBalloon
        extends Balloon {
    public FancyBalloon() {
        super();
    }

    public FancyBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    public double distance(int x, int y) {

        int g = getX();
        int c = getY();
        double dx =(x - g);
        double dy = (y - c);
        return Math.max(dx, dy);


    }

    public void draw(Graphics g, boolean makeItFilled) {
        int x = getX();
        int y = getY();
        int r = getRadius();

        g.drawRoundRect(x - r, y -r , 2*r, 2*r, x ,y);




    }
}