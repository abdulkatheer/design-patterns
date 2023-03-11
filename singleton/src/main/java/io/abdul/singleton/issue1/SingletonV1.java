package io.abdul.singleton.issue1;

import java.io.Serializable;

public class SingletonV1 implements Serializable {
    private static SingletonV1 INSTANCE = null;

    private int value;

    private SingletonV1() {
    }

    public static SingletonV1 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonV1.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonV1();
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
}