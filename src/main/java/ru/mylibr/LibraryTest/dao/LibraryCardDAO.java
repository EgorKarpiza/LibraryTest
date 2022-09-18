package ru.mylibr.LibraryTest.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.dao.mappers.LibraryCardMapper;
import ru.mylibr.LibraryTest.entities.request.LibraryCard;

import java.util.List;

@Component
public class LibraryCardDAO {
    private LibraryCardMapper libraryCardMapper;
    private static final Logger logger = LoggerFactory.getLogger(LibraryCardDAO.class);
    @Autowired
    public LibraryCardDAO(LibraryCardMapper libraryCardMapper) {
        this.libraryCardMapper = libraryCardMapper;
    }

    /**
     * saveLibraryCard- метод сохранения параметров libraryCard
     * @param libraryCard- входное значение- объект:libraryCard
     */
    public void saveLibraryCard(LibraryCard libraryCard){
        logger.info("Сохраняем объект [{}]", libraryCard);
        libraryCardMapper.saveLibraryCardParams(libraryCard);
    }
    /**
     * delLibraryCard- метод удаления строки libraryCard
     * @param idLibraryCard-входное значение- объект: int idLibraryCard
     */
    public void delLibraryCard(int idLibraryCard){
        logger.info("Удаляем строку по id из таблицы libraryCard [{}]", idLibraryCard);
        libraryCardMapper.delLibraryCardParams(idLibraryCard);
    }
    /**
     * updateLibraryCard- метод изменения параметров libraryCard
     * @param libraryCard- входное значение- объект:libraryCard
     */
    public void updateLibraryCard(LibraryCard libraryCard){
        logger.info("Изменяем объект [{}]", libraryCard);
        libraryCardMapper.updateLibraryCardParams(libraryCard);
    }
    public List<LibraryCard> selLibraryCard(){
        return libraryCardMapper.findAllLibraryCard();
    }
}