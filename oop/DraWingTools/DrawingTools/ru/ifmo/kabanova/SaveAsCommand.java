package ru.ifmo.kabanova;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by catherine on 08.04.15.
 */
public class SaveAsCommand implements Command {
    private DWTModel model;
    private String fileName;

    public SaveAsCommand(DWTModel model,String fileName) {
        this.model = model;
        this.fileName = fileName;
    }

    public void execute() {
        try {
            JFileChooser jf = new JFileChooser();

            TextFileFilterClass pngFilter = new TextFileFilterClass(".png");
            TextFileFilterClass jpgFilter = new TextFileFilterClass(".jpg");

            jf.addChoosableFileFilter(pngFilter);
            jf.addChoosableFileFilter(jpgFilter);
            int result = jf.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                fileName = jf.getSelectedFile().getAbsolutePath();
            }

            if (jf.getFileFilter() == pngFilter) {
                ImageIO.write(model.getImage(), "png", new File(fileName + ".png"));
            } else {
                ImageIO.write(model.getImage(), "jpeg", new File(fileName + ".jpg"));
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new DWTFrame(), "Ошибка ввода-вывода");
        }

    }

    @Override
    public void undo() {

    }
}
