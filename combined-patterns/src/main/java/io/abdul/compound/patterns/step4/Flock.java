package io.abdul.compound.patterns.step4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    private final List<Quackable> quackables = new ArrayList<>();

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }

    public void addQuackable(Quackable quackable) {
        this.quackables.add(quackable);
    }
}
