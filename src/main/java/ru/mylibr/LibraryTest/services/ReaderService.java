package ru.mylibr.LibraryTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mylibr.LibraryTest.dao.ReaderDAO;
import ru.mylibr.LibraryTest.entities.request.Reader;

import java.util.List;

@Service
public class ReaderService {
    private ReaderDAO readerDAO;
    @Autowired
    public ReaderService(ReaderDAO readerDAO) {
        this.readerDAO = readerDAO;
    }

    public void saveReader(Reader reader) {
        readerDAO.saveReader(reader);
    }
    public void delReader(Reader reader) {
        readerDAO.delReader(reader.getId_reader());
    }
    public void updateReader(Reader reader) {
        readerDAO.updateReader(reader);
    }
    public List<Reader> selReader(){
        return readerDAO.selReader();
    }
}