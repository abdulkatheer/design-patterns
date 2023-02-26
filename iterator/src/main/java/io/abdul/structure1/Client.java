package io.abdul.structure1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Aggregate<String> books = new ConcreteAggregate<String>(List.of("Java", "Python"));

        Iterator<String> booksIterator = books.createIterator();

        while (booksIterator.hasNext()) {
            System.out.println(booksIterator.next());
        }
    }
}
