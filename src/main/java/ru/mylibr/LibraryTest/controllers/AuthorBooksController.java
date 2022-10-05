package ru.mylibr.LibraryTest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mylibr.LibraryTest.entities.request.AuthorBooks;
import ru.mylibr.LibraryTest.services.AuthorBooksService;

import java.util.List;


@RestController
@RequestMapping(method= RequestMethod.POST, produces={"application/json; charset=UTF-8"})

public class AuthorBooksController {
    private static final Logger logger = LoggerFactory.getLogger(AuthorBooksController.class);
    private AuthorBooksService authorBooksService;

    @Autowired
    public AuthorBooksController (AuthorBooksService authorBooksService){
        this.authorBooksService=authorBooksService;
    }

    @PostMapping("/saveauthorbooks")
    public void saveauthorbooks(@RequestBody AuthorBooks authorBooks){
        authorBooksService.saveAuthorBooks(authorBooks);
    }
    @PostMapping("/delauthorbooks")
    public void delauthorbooks(@RequestBody AuthorBooks authorBooks){
        authorBooksService.delAuthorBooks(authorBooks);
    }
    @PostMapping("/updateauthorbooks")
    public void updateauthorbooks(@RequestBody AuthorBooks authorBooks){
        authorBooksService.updateAuthorBooks(authorBooks);
    }
    @GetMapping("/selauthorbooks")
    public List<AuthorBooks> selauthorbooks(){
        return authorBooksService.selAuthorBooks();
    }
}