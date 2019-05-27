package ru.ifmo.kabanova;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga Bolshakova (obolshakova@yandex-team.ru)
 * <p/>
 * 28.03.15 3:57
 */
public class DWTModel {

    private BufferedImage image;
    private Color color;
    private boolean isPickerEnabled = false;

    private final List<DWTModelListener> listeners = new ArrayList<DWTModelListener>();

    public void setImage(final String imagePath) {
        try {
            setImage(ImageIO.read(new File(imagePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void startPicker() {
        this.isPickerEnabled = true;
    }

    public void endPicker() {
        this.isPickerEnabled = false;
    }

    public boolean isPickerEnabled() {
        return isPickerEnabled;
    }

    public Color getColor() {
        return color;
    }

    public void setImage(final BufferedImage image) {
        this.image = image;
        fireImageChanged();
    }

    public void colorPicked(final Color color) {
        this.color = color;
        fireImageChanged();
    }

    private void fireImageChanged() {
        for (final DWTModelListener listener : listeners) {
            listener.modelChanged();
        }
    }

    public void addListener(final DWTModelListener listener) {
        listeners.add(listener);
    }

    public BufferedImage getImage() {
        return image;
    }
}
