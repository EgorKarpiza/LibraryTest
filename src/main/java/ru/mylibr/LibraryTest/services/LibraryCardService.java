package ru.mylibr.LibraryTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mylibr.LibraryTest.dao.LibraryCardDAO;
import ru.mylibr.LibraryTest.entities.request.LibraryCard;

import java.util.List;

@Service
public class LibraryCardService {
    private LibraryCardDAO libraryCardDAO;
    @Autowired
    public LibraryCardService(LibraryCardDAO libraryCardDAO) {
        this.libraryCardDAO = libraryCardDAO;
    }

    public void saveLibraryCard(LibraryCard libraryCard) {
        libraryCardDAO.saveLibraryCard(libraryCard);
    }
    public void delLibraryCard(LibraryCard libraryCard) {
        libraryCardDAO.delLibraryCard(libraryCard.getId_library_card());
    }
    public void updateLibraryCard(LibraryCard libraryCard) {
        libraryCardDAO.updateLibraryCard(libraryCard);
    }
    public List<LibraryCard> selLibraryCard(){
        return libraryCardDAO.selLibraryCard();
    }
}