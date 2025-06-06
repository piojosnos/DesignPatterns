package org.cyrano.plugins.sad;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.cyrano.common.ImageCache;
import org.cyrano.plugins.PaintableBase;
import org.cyrano.plugins.PaintableFactory;

public class SadPaintable extends PaintableBase {

  private BufferedImage bufferedImage;

  // --------------------------------------------------------------------------------

  public SadPaintable(int x1, int y1, int x2, int y2) {
    super(x1, y1, x2, y2);

    bufferedImage = ImageCache.getInstance().getImage("smile0.png", getClass());
  }

  // --------------------------------------------------------------------------------

  @Override
  public void draw(Graphics2D g2d) {
    g2d.drawImage(bufferedImage, x1, y1, x2 - x1, y2 - y1, null);
  }

  // --------------------------------------------------------------------------------

  @Override
  public PaintableFactory getPaintableFactory() {
    return new SadPaintableFactory();
  }
}
