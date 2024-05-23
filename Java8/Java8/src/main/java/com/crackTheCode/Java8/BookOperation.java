package com.crackTheCode.Java8;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookOperation {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        // Creating sample book entries
        books.add(createBook("To Kill a Mockingbird", 1960, 7, 11));
        books.add(createBook("1984", 1949, 6, 8));
        books.add(createBook("The Great Gatsby", 1925, 4, 10));
        books.add(createBook("1984", 1967, 5, 30));
        books.add(createBook("Pride and Prejudice", 1813, 1, 28));
        books.add(createBook("The Catcher in the Rye", 1951, 7, 16));
        books.add(createBook("Pride and Prejudice", 1851, 10, 18));
        books.add(createBook("Pride and Prejudice", 1869, 3, 4));
        books.add(createBook("The Odyssey", -800, 1, 1)); // Approximate year
        books.add(createBook("Pride and Prejudice", 1880, 11, 1));

        List<Book> sortedBooks = books.stream()
                .sorted((b1, b2) -> b1.getPublicationDate().compareTo(b2.getPublicationDate()))
                .collect(Collectors.toList());

        List<Book> descList = books.stream().sorted(Comparator.comparing
                (Book::getPublicationDate).reversed()).collect(Collectors.toList());

//        for(Book k: sortedBooks) {
//            System.out.println(k.publicationDate);
//        }
//
//        for(Book k : descList) {
//            System.out.println(k.publicationDate);
//        }

//        books.stream().map(x->x.getBookName())
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .filter(x->x.getValue() > 1)
//                .map(Map.Entry :: getKey)
//                .forEach(System.out::println);

        List<Integer> numbers = List.of(2,6,1,5,4,10,3);
        int sumOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToInt(Integer::intValue) // Convert Integer to int
                .reduce(0, (a, b) -> a + b); // Accumulate the sum

        System.out.println(sumOfEvenNumbers);

    }

    private static Book createBook(String name, int year, int month, int day) {
        Book book = new Book();
        book.setBookName(name);
        book.setPublicationDate(OffsetDateTime.of(year, month, day, 0, 0, 0, 0, ZoneOffset.UTC));
        return book;
    }

}
