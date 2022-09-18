package ru.mylibr.LibraryTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mylibr.LibraryTest.dao.AuthorBooksDAO;
import ru.mylibr.LibraryTest.entities.request.AuthorBooks;

import java.util.List;

@Service
public class AuthorBooksService {
    private AuthorBooksDAO authorBooksDAO;
    @Autowired
    public AuthorBooksService(AuthorBooksDAO authorBooksDAO) {
        this.authorBooksDAO = authorBooksDAO;
    }

    public void saveAuthorBooks(AuthorBooks authorBooks) {
        authorBooksDAO.saveAuthorBooks(authorBooks);
    }
    public void delAuthorBooks(AuthorBooks authorBooks) {
        authorBooksDAO.delAuthorBooks(authorBooks.getId_author_books());
    }
    public void updateAuthorBooks(AuthorBooks authorBooks) {
        authorBooksDAO.updateAuthorBooks(authorBooks);
    }
    public List<AuthorBooks> selAuthorBooks(){
        return authorBooksDAO.selAuthorBooks();
    }
}