package com.subhra.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable("bookId") Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.isPresent() ? book.get() : null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.saveAndFlush(book);
    }

}
