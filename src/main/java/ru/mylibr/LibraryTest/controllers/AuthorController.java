package ru.mylibr.LibraryTest.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mylibr.LibraryTest.entities.request.Author;
import ru.mylibr.LibraryTest.services.AuthorService;

import java.util.List;

@RestController
    @RequestMapping(method= RequestMethod.POST, produces={"application/json; charset=UTF-8"})
    public class AuthorController {
        private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);
        private AuthorService authorService;
        @Autowired
        public AuthorController (AuthorService authorService){
            this.authorService=authorService;
        }

        @PostMapping("/saveauthor")
        public void seveauthor(@RequestBody Author author){
            authorService.saveAuthor(author);
        }
        @PostMapping("/delauthor")
        public void delauthor(@RequestBody Author author){
        authorService.delAuthor(author);
        }
        @PostMapping("/updateauthor")
        public void updateauthor(@RequestBody Author author){
        authorService.updateAuthor(author);
        }
        @GetMapping("/selauthor")
            public List<Author> selauthor(){
            return authorService.selAuthor();
        }
    }
