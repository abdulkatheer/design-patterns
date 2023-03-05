package io.abdul.decorator.example3;

import java.io.*;

public class FileDataSource implements DataSource {
    private File file;

    public FileDataSource(File file) {
        this.file = file;
    }

    @Override
    public void writeData(String data) {
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
            fos.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }


}