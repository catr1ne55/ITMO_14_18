package ru.ifmo.kabanova; /**
 * Created by catherine on 22.02.15.
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ChangeColour {

    private DWTModel model;

    public ChangeColour(DWTModel model){
        this.model = model;
    }
    public BufferedImage colorImage(BufferedImage image) {

        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage imageARGB = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int xx = 0; xx < width; xx++) {
            for (int yy = 0; yy < height; yy++) {
                Color color = model.getColor();
                if (color.getRGB() == image.getRGB(xx,yy)) {
                     imageARGB.setRGB(xx, yy, Color.TRANSLUCENT);
                }
                else {
                    imageARGB.setRGB(xx,yy, image.getRGB(xx,yy));
                }
            }
        }
        return imageARGB;
    }
}
