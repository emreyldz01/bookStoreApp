package com.emrebeyproje.bookstore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.emrebeyproje.bookstore.model.Book;
/**
 * @author Emre YILDIZ
 */

public interface BookRepository extends JpaRepository<Book,Integer> { }
