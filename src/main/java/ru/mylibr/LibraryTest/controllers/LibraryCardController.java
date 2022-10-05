package ru.mylibr.LibraryTest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mylibr.LibraryTest.entities.request.LibraryCard;
import ru.mylibr.LibraryTest.services.LibraryCardService;

import java.util.List;

@RestController
@RequestMapping(method= RequestMethod.POST, produces={"application/json; charset=UTF-8"})

public class LibraryCardController {
    private static final Logger logger = LoggerFactory.getLogger(LibraryCardController.class);
    private LibraryCardService libraryCardService;
    @Autowired
    public LibraryCardController (LibraryCardService libraryCardService){
        this.libraryCardService=libraryCardService;
    }

    @PostMapping("/savelibrarycard")
    public void sevelibrarycard(@RequestBody LibraryCard libraryCard){
        libraryCardService.saveLibraryCard(libraryCard);
    }
    @PostMapping("/dellibrarycard")
    public void dellibrarycard(@RequestBody LibraryCard libraryCard) {
        libraryCardService.delLibraryCard(libraryCard);
    }
    @PostMapping("/updatelibrarycard")
    public void updatelibrarycard(@RequestBody LibraryCard libraryCard){
        libraryCardService.updateLibraryCard(libraryCard);
    }
    @GetMapping("/sellibrarycard")
    public List<LibraryCard> sellibrarycard(){
        return libraryCardService.selLibraryCard();
    }
}
