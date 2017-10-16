/**
 * Represents a balloon in the Balloon.RoundBalloon program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class OvalBalloon
        extends Balloon
{
    public OvalBalloon()
    {
        super();
    }

    public OvalBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

public double distance(int x, int y)
{

    int g = getX();
    int c = getY();
    double dx = 2*(x - g);
    double dy = (y - c);
    return Math.sqrt(dx*dx + dy*dy);
}
    public void draw(Graphics g, boolean makeItFilled)
    {
        int x = getX();
        int y = getY();
        int r = getRadius();

        g.fillOval(x - (r/2), y - r, r, 2*r);
    }
}