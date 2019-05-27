package ru.ifmo.kabanova;


import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

/**
 * Created by catherine on 22.04.15.
 */
public class RobotColorClick {


    public Robot robot;
    public RobotColorClick() throws AWTException, IOException, InterruptedException {
        this.robot = new Robot();
    }

    public Color getColor() {

        int x = (int) MouseInfo.getPointerInfo().getLocation().getX();
        int y = (int) MouseInfo.getPointerInfo().getLocation().getY();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        Color color = robot.getPixelColor(x, y);
        System.out.println("Color" + color.getRGB());
        return color;
    }
}
