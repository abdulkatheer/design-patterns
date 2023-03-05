package io.abdul.decorator.example3;

public interface DataSource {
    void writeData(String data);

    String readData();
}