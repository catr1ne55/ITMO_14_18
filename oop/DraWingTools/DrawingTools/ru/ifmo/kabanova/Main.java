package ru.ifmo.kabanova;
import javax.swing.*;

/**
 * Created by catherine on 08.03.15.
 */

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DWTFrame();
            }
        });
    }
}


