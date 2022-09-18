package ru.mylibr.LibraryTest.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
/**
 * AuthorBooksResp- Ответ на запрос промежуточной таблицы author_books
 */
public class AuthorBooksResp {
    @JsonProperty
    private int id_author_books;
    public int getIdAuthorBooks() {
        return id_author_books;
    }
    public void setIdAuthorBooks(int id_author_books) {
        this.id_author_books = id_author_books;
    }

    @JsonProperty
    private int id_author;
    public int getIdAuthor() {
        return id_author;
    }
    public void setIdAuthor(int id_author) {
        this.id_author = id_author;
    }

    @JsonProperty
    private int id_book;
    public int getIdBook() {
        return id_book;
    }
    public void setIdBook(int id_book) {
        this.id_book = id_book;
    }

    public AuthorBooksResp(int id_author_books, int id_author, int id_book) {
        super();
        this.id_author_books = id_author_books;
        this.id_author = id_author;
        this.id_book = id_book;
    }

    public String toString() {
        return "AuthorBooks{" +
                "id_author_books='" + id_author_books + '\'' +
                ", id_author='" + id_author + '\'' +
                ", id_book='" + id_book +
                '}';
    }
}