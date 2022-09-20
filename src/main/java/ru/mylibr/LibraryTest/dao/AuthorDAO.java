package ru.mylibr.LibraryTest.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.dao.mappers.AuthorMapper;
import ru.mylibr.LibraryTest.entities.request.Author;

import java.util.List;

@Component
public class AuthorDAO {
    private AuthorMapper authorMapper;
    private static final Logger logger = LoggerFactory.getLogger(AuthorDAO.class);
    @Autowired
    public AuthorDAO(AuthorMapper authorMapper) {
        this.authorMapper = authorMapper;
    }

    /**
     * saveAuthor- метод сохранения параметров author
     * @param author- входное значение- объект:Author
     */
    public void saveAuthor(Author author){
        logger.info("Сохраняем объект [{}]", author);
        authorMapper.saveAuthorParams(author);
    }
    /**
     * delAuthor- метод удаления строки author
     * @param idAuthor-входное значение- объект: int idAuthor
     */
    public void delAuthor(int idAuthor){
        logger.info("Удаляем строку по id из таблицы author [{}]", idAuthor);
        authorMapper.delAuthorParams(idAuthor);
    }
    /**
     * updateAuthor- метод изменения параметров author
     * @param author- входное значение- объект:Author
     */
    public void updateAuthor(Author author){
        logger.info("Изменяем объект [{}]", author);
        authorMapper.updateAuthorParams(author);
    }
    public List<Author> selAuthor(){
       return authorMapper.findAllAuthor();
    }
}
