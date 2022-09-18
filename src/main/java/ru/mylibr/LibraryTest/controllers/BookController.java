package ru.mylibr.LibraryTest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mylibr.LibraryTest.entities.request.Book;
import ru.mylibr.LibraryTest.services.BookService;

import java.util.List;

@RestController
@RequestMapping(method= RequestMethod.POST, produces={"application/json; charset=UTF-8"})

public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);
    private BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/savebook")
    public void sevebook(@RequestBody Book book) {
        bookService.saveBook(book);
    }
    @PostMapping("/delbook")
    public void delbook(@RequestBody Book book) {
        bookService.delBook(book);
    }
    @PostMapping("/updatebook")
    public void updatebook(@RequestBody Book book) {
        bookService.updateBook(book);
    }
    @PostMapping("/selbook")
    public List<Book> selbook(){
        return bookService.selBook();
    }
}
