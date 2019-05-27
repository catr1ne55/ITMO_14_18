package ru.ifmo.kabanova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by catherine on 12.03.15.
 */


public class ButtonsPanel extends JPanel implements DWTModelListener {

    private static final long serialVersionUID = 1L;

    private final DWTModel model;
    public final JPanel colorButton;


    public ButtonsPanel(final DWTModel model) {
        this.model = model;
        this.model.addListener(this);

        setLayout(new BorderLayout());
        JToolBar toolBar = new JToolBar("Options");
        add(toolBar, BorderLayout.NORTH);
        toolBar.setOrientation(SwingConstants.HORIZONTAL);

        Box.createHorizontalGlue();
        JButton button;
        button = new JButton("Открыть файл");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                new OpenFileCommand(model).execute();
            }
        });
        toolBar.add(button);

        toolBar.add(Box.createHorizontalStrut(10));

        button = new JButton("Сохранить файл");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                new SaveAsCommand(model, "").execute();
            }
        });
        toolBar.add(button);

        toolBar.addSeparator();

        button = new JButton("Сконвертировать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                new ConvertImageCommand(model).execute();
            }
        });
        toolBar.add(button);

        toolBar.add(Box.createHorizontalStrut(10));

        button = new JButton("Пипетка");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                if (!model.isPickerEnabled()) {
                    model.startPicker();
                }
            }
        });
        toolBar.add(button);

        toolBar.add(Box.createHorizontalStrut(10));

        colorButton = new JPanel();
        colorButton.setBackground(Color.white);
        colorButton.setPreferredSize(new Dimension(30, 30));
        colorButton.setMinimumSize(new Dimension(30, 30));
        colorButton.setMaximumSize(new Dimension(30, 30));
        colorButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        toolBar.add(colorButton);
    }

    @Override
    public void modelChanged() {
        colorButton.setBackground(model.getColor());
    }
}

