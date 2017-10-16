/**
 * Represents a balloon in the Balloon.RoundBalloon program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon
        extends Balloon
{
    public SquareBalloon()
    {
        super();
    }

    public SquareBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    public double distance(int x, int y)
    {

        int g = getX();
        int c = getY();
        double dx = (x - g);
        double dy = (y - c);
        double dex = -1*(x - g);
        double dey = -1*(y - c);
        Math.abs(dx);
        Math.abs(dy);
        double k = Math.max(dx, dy);
        double h = Math.max(dex, dey);
        return Math.max(k, h);


    }

    public void draw(Graphics g, boolean makeItFilled)
    {
        int x = getX();
        int y = getY();
        int r = getRadius();


        g.fillRect(x - r, y - r, 2*r, 2*r);
    }
}