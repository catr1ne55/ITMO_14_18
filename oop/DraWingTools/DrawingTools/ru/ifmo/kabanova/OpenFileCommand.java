package ru.ifmo.kabanova;

import javax.swing.*;

/**
 * Created by catherine on 08.04.15.
 */
public class OpenFileCommand implements Command {

    private DWTModel model;

    public OpenFileCommand(DWTModel model) {
        this.model = model;
    }

    public void execute() {
        JFileChooser jf = new JFileChooser();
        int result = jf.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                String fileName = jf.getSelectedFile().getAbsolutePath();
                jf.addChoosableFileFilter(new TextFileFilterClass(".png"));
                jf.addChoosableFileFilter(new TextFileFilterClass(".jpg"));
                model.setImage(fileName);

            } catch (Exception ignored) {
            }
        }
    }

    @Override
    public void undo() {

    }
}
