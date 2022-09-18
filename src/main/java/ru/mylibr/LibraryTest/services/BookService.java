package ru.mylibr.LibraryTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mylibr.LibraryTest.dao.BookDAO;
import ru.mylibr.LibraryTest.entities.request.Book;

import java.util.List;

@Service
public class BookService {
    private BookDAO bookDAO;
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public void saveBook(Book book){
          bookDAO.saveBook(book);
    }
    public void delBook(Book book) {
        bookDAO.delBook(book.getId_book());
    }
    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }
    public List<Book> selBook(){
        return bookDAO.selBook();
    }
}