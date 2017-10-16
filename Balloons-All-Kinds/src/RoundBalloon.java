/**
 * Represents a balloon in the Balloon.RoundBalloon program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon
                    extends Balloon
{
  public RoundBalloon()
  {
    super();
  }

  public RoundBalloon(int x, int y, int r, Color c) {
      super(x, y, r, c);
  }


  public void draw(Graphics g, boolean makeItFilled)
  {
int x = getX();
int y = getY();
int r = getRadius();

    g.fillOval(x - r, y - r, 2*r, 2*r);
  }
}