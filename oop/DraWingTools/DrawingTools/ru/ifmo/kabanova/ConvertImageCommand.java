package ru.ifmo.kabanova;

/**
 * Created by catherine on 08.04.15.
 */
public class ConvertImageCommand implements Command{
    private DWTModel model;

    public ConvertImageCommand(DWTModel model) {
        this.model = model;
    }


    @Override
    public void execute() {
        ChangeColour changeColour = new ChangeColour(model);
        model.setImage(changeColour.colorImage(model.getImage()));
    }

    @Override
    public void undo() {

    }
}
