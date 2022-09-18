package ru.mylibr.LibraryTest.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookResp {

    @JsonProperty
    private int id_book;
    public int getIdBook() {
        return id_book;
    }
    public void setIdBook(int id_book) {
        this.id_book = id_book;
    }
    @JsonProperty
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty
    private int number_of_pages;
    public int getNumberOfPages() {
        return number_of_pages;
    }
    public void setNumberOfPages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public BookResp(int id_book, String title, int number_of_pages) {
        super();
        this.id_book = id_book;
        this.title = title;
        this.number_of_pages=number_of_pages;
    }

    public String toString() {
        return "Book{" +
                "id_author='" + id_book + '\'' +
                ", title='" + title + '\'' +
                ", number_of_pages='" + number_of_pages +
                '}';
    }
}