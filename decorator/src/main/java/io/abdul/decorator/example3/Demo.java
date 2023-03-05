package io.abdul.decorator.example3;

import io.abdul.decorator.example2.Client;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) throws IOException {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(getFile("encoding-demo.txt"))));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(getFile("encoding-demo.txt"));

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
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