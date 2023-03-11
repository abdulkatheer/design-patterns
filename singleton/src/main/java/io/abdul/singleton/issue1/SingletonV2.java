package io.abdul.singleton.issue1;

import java.io.Serializable;

public class SingletonV2 implements Serializable {
    private static SingletonV2 INSTANCE = null;

    private int value;

    private SingletonV2() {
    }

    public static SingletonV2 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonV2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonV2();
                }
            }
        }
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}