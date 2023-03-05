package io.abdul.decorator.example2;

import java.io.*;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws IOException {
        int c;
        try (InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream(getFile("test.txt"))))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        try (InputStream in2 =
                     new UpperCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream(getFile("test.txt"))))) {
            while ((c = in2.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File getFile(String fileName) throws IOException {
        ClassLoader classLoader = Client.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }
}