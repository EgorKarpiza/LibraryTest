package ru.mylibr.LibraryTest.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.dao.mappers.AuthorBooksMapper;
import ru.mylibr.LibraryTest.entities.request.AuthorBooks;

import java.util.List;

@Component
public class AuthorBooksDAO {
    private AuthorBooksMapper authorBooksMapper;
    private static final Logger logger = LoggerFactory.getLogger(AuthorBooksDAO.class);
    @Autowired
    public AuthorBooksDAO(AuthorBooksMapper authorBooksMapper) {
        this.authorBooksMapper = authorBooksMapper;
    }

    /**
     * saveAuthorBooks- метод сохранения параметров authorBooks
     * @param authorBooks- входное значение- объект:AuthorBooks
     */
    public void saveAuthorBooks(AuthorBooks authorBooks){
        logger.info("Сохраняем объект [{}]", authorBooks);
        authorBooksMapper.saveAuthorBooksParams(authorBooks);
    }
    /**
     * delAuthorBooks- метод удаления строки authorBooks
     * @param idAuthorBooks-входное значение- объект: int idAuthorBooks
     */
    public void delAuthorBooks(int idAuthorBooks){
        logger.info("Удаляем строку по id из таблицы author_books [{}]", idAuthorBooks);
        authorBooksMapper.delAuthorBooksParams(idAuthorBooks);
    }
    /**
     * updateAuthorBooks- метод изменения параметров authorBooks
     * @param authorBooks- входное значение- объект:AuthorBooks
     */
    public void updateAuthorBooks(AuthorBooks authorBooks){
        logger.info("Изменяем объект [{}]", authorBooks);
        authorBooksMapper.updateAuthorBooksParams(authorBooks);
    }
    public List<AuthorBooks> selAuthorBooks(){
        return authorBooksMapper.findAllAuthorBooks();
    }
}