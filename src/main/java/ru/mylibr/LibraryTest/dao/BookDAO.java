package ru.mylibr.LibraryTest.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.dao.mappers.BookMapper;
import ru.mylibr.LibraryTest.entities.request.Book;

import java.util.List;


@Component
public class BookDAO {
    private BookMapper bookMapper;
    private static final Logger logger = LoggerFactory.getLogger(BookDAO.class);
    @Autowired
    public BookDAO(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * saveBook- метод сохранения параметров book
     * @param book- входное значение- объект:book
     */
    public void saveBook(Book book){
        logger.info("Сохраняем объект [{}]", book);
        bookMapper.saveBookParams(book);
    }
    /**
     * delBook- метод удаления строки book
     * @param idBook-входное значение- объект: int idBook
     */
    public void delBook(int idBook){
        logger.info("Удаляем строку по id из таблицы book [{}]", idBook);
        bookMapper.delBookParams(idBook);
    }
    /**
     * updateBook- метод изменения параметров book
     * @param book- входное значение- объект:book
     */
    public void updateBook(Book book){
        logger.info("Изменяем объект [{}]", book);
        bookMapper.updateBookParams(book);
    }
    public List<Book> selBook(){
        return bookMapper.findAllBook();
    }
}
