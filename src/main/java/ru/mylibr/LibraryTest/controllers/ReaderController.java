package ru.mylibr.LibraryTest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mylibr.LibraryTest.entities.request.Reader;
import ru.mylibr.LibraryTest.services.ReaderService;

import java.util.List;

@RestController
@RequestMapping(method= RequestMethod.POST, produces={"application/json; charset=UTF-8"})

public class ReaderController {
    private static final Logger logger = LoggerFactory.getLogger(ReaderController.class);
    private ReaderService readerService;
    @Autowired
    public ReaderController (ReaderService readerService){
        this.readerService=readerService;
    }

    @PostMapping("/savereader")
    public void severeader(@RequestBody Reader reader){
        readerService.saveReader(reader);
    }
    @PostMapping("/delreader")
    public void delreader(@RequestBody Reader reader) {
        readerService.delReader(reader);
    }
    @PostMapping("/updatereader")
    public void updatereader(@RequestBody Reader reader){
        readerService.updateReader(reader);
    }
    @GetMapping("/selreader")
    public List<Reader> selreader(){
        return readerService.selReader();
    }
}
