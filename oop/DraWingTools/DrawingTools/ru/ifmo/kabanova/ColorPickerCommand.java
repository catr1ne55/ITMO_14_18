package ru.ifmo.kabanova;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;

/**
 * Created by catherine on 22.04.15.
 */
public class ColorPickerCommand implements Command {
    private DWTModel model;

    public ColorPickerCommand(DWTModel model) {
        this.model = model;

    }

    public void execute() {
        try {
            model.colorPicked( new RobotColorClick().getColor());
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void undo() {

    }
}
