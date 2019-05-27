package ru.ifmo.kabanova;

/**
 * Created by catherine on 08.04.15.
 */
public class SetOfCommands {
    Command[] commands;
    private final DWTModel model;
    private final String fileName;
    private ImagePanel imagePanel;

    public SetOfCommands(DWTModel model, String fileName) {
        this.model = model;
        this.fileName = fileName;
        commands = new Command[4];
        commands[0] = new OpenFileCommand(model);
        commands[1] = new SaveAsCommand(model, fileName);
        commands[2] = new ConvertImageCommand(model);
        commands[3] = new ColorPickerCommand(model);


    }

    public void executeCommand(int i) {
        commands[i].execute();
    }


}
