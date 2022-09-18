package ru.mylibr.LibraryTest.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.dao.mappers.ReaderMapper;
import ru.mylibr.LibraryTest.entities.request.Reader;

import java.util.List;

@Component
public class ReaderDAO {
    private ReaderMapper readerMapper;
    private static final Logger logger = LoggerFactory.getLogger(ReaderDAO.class);
    @Autowired
    public ReaderDAO(ReaderMapper readerMapper) {
        this.readerMapper = readerMapper;
    }

    /**
     * saveReader- метод сохранения параметров reader
     * @param reader- входное значение- объект:reader
     */
    public void saveReader(Reader reader){
        logger.info("Сохраняем объект [{}]", reader);
        readerMapper.saveReaderParams(reader);
    }
    /**
     * delReader- метод удаления строки reader
     * @param idReader-входное значение- объект: int idReader
     */
    public void delReader(int idReader){
        logger.info("Удаляем строку по id из таблицы reader [{}]", idReader);
        readerMapper.delReaderParams(idReader);
    }
    /**
     * updateReader- метод изменения параметров reader
     * @param reader- входное значение- объект:reader
     */
    public void updateReader(Reader reader){
        logger.info("Изменяем объект [{}]", reader);
        readerMapper.updateReaderParams(reader);
    }
    public List<Reader> selReader(){
        return readerMapper.findAllReader();
    }
}