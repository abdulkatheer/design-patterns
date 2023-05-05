package io.abdul.compound.patterns.step2;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {
    private final List<BeatObserver> beatObservers = new ArrayList<>();
    private final List<BPMObserver> bpmObservers = new ArrayList<>();

    private int bpm = 90;
    private boolean stop = false;
    private Clip clip;

    @Override
    public void initialize() {
        try {
            InputStream clipStream = this.getClass().getClassLoader().getResourceAsStream("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(clipStream));
        } catch (Exception ex) {
            System.out.println("Error: Can't load clip");
            System.out.println(ex);
        }
    }

    @Override
    public void on() {
        bpm = 90;
        Thread thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBPM());
            } catch (Exception e) {
            }
        }
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    private void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    private void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }

    private void notifyBPMObservers() {
        for (BPMObserver observer : bpmObservers) {
            observer.updateBPM(bpm);
        }
    }

    private void notifyBeatObservers() {
        for (BeatObserver observer : beatObservers) {
            observer.updateBeat();
        }
    }
}

