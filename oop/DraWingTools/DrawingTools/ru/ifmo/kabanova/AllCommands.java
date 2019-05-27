package ru.ifmo.kabanova;

/**
 * Created by catherine on 19.05.15.
 */
public class AllCommands {
    Command[] onCommand;
    Command[] offCommand;
    Command undo;

    public AllCommands() {
        onCommand = new Command[4];
        offCommand = new Command[4];

        Command nothingToDo = new NothingToDoCommand();
        for (int i = 0; i < 4; i++) {
            offCommand[i] = nothingToDo;
            onCommand[i] = nothingToDo;
        }
        undo = nothingToDo;
    }

    public void setCommand(int i, Command on, Command off) {
        onCommand[i] = on;
        offCommand[i] = off;
    }

    public void commandOn(int i){
        onCommand[i].execute();
        undo = onCommand[i];
    }

    public void commandOff(int i){
        offCommand[i].execute();
        undo = offCommand[i];
    }

    public void commandUndo(){
        undo.undo();
    }

}
