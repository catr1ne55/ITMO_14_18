package ru.ifmo.kabanova;

/**
 * Created by catherine on 08.04.15.
 */
public interface Command {
    void execute();
    void undo();
}
