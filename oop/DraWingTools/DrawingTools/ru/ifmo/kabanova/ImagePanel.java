package ru.ifmo.kabanova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * Created by Olga Bolshakova (obolshakova@yandex-team.ru)
 * <p/>
 * 28.03.15 4:14
 */
public class ImagePanel extends JPanel implements DWTModelListener {

    private final DWTModel model;

    public ImagePanel(final DWTModel model) {
        super();
        this.model = model;
        this.model.addListener(this);

        this.addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseMoved(final MouseEvent mouseEvent) {
                if (model.isPickerEnabled()) {
                    try {
                        Robot robot = new Robot();
                        Point coord = MouseInfo.getPointerInfo().getLocation();
                        model.colorPicked(robot.getPixelColor(coord.x, coord.y));
                    } catch (AWTException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                if (model.isPickerEnabled()) {
                    model.endPicker();
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        final BufferedImage img = this.model.getImage();
        if (img != null) {
            return new Dimension(img.getWidth(), img.getHeight());
        }
        //return super.getPreferredSize();
        return new Dimension(500,500);
    }

    @Override
    public void paintComponent(final Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(model.getImage(), 0, 0, this);
    }

    @Override
    public void modelChanged() {
        this.repaint();
    }


}
