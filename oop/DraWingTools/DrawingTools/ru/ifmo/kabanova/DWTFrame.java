package ru.ifmo.kabanova; /**
 * Created by catherine on 08.03.15.
 */

import ru.ifmo.kabanova.ButtonsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DWTFrame extends JFrame {


    public DWTFrame() {
        super("DraWingTools");

        final DWTModel model = new DWTModel();
        final ButtonsPanel buttonsPanel = new ButtonsPanel(model);
        final ImagePanel panel = new ImagePanel(model);
        final JScrollPane scrollPane = new JScrollPane(panel);

        setSize(500, 500);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(buttonsPanel);
        getContentPane().add(scrollPane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

