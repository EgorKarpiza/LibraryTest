package ru.mylibr.LibraryTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mylibr.LibraryTest.dao.AuthorDAO;
import ru.mylibr.LibraryTest.entities.request.Author;

import java.util.List;

@Service
public class AuthorService {
    private AuthorDAO authorDAO;
    @Autowired
    public AuthorService(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public void saveAuthor(Author author) {
        authorDAO.saveAuthor(author);
    }
    public void delAuthor(Author author) {
        authorDAO.delAuthor(author.getId_author());
    }
    public void updateAuthor(Author author) {
        authorDAO.updateAuthor(author);
    }
    public List<Author> selAuthor(){
        return authorDAO.selAuthor();
    }
}