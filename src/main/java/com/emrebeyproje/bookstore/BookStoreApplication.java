package com.emrebeyproje.bookstore;

import com.emrebeyproje.bookstore.model.Book;
import com.emrebeyproje.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner
{

    private final BookRepository bookRepository;

    public BookStoreApplication(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(BookStoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Book book1 = Book.builder().name("yuzuklerin efendisi")
                .author("J.R.R Tolkien")
                .price(14.10)
                .stock(10).build();

        Book book2 = Book.builder().name("Baslangıc")
                .author("Emre Yldz")
                .price(15.99)
                .stock(15).build();

        Book book3 = Book.builder().name("Tanrinin Formulası")
                .author("Santos")
                .price(20.99)
                .stock(20).build();

        bookRepository.saveAll(Arrays.asList(book1,book2,book3));

    }
}
