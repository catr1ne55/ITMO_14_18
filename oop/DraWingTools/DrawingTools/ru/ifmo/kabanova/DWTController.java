package ru.ifmo.kabanova;

/**
 * Created by catherine on 22.04.15.
 */
public class DWTController implements DWTModelListener {

    private final DWTModel model;
    private final ImagePanel imagePanel;

    public DWTController(DWTModel model, ImagePanel imagePanel){
        this.model = model;
        this.imagePanel = imagePanel;
    }

    @Override
    public void modelChanged() {
        imagePanel.update(model.getImage().getGraphics());

    }
}
