package io.abdul.compound.patterns.step1;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    private static final long serialVersionUID = 2L;

    public BeatBar() {
        Thread thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            int value = getValue();
            value = (int) (value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
