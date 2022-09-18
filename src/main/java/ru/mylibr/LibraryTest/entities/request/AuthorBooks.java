package ru.mylibr.LibraryTest.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class AuthorBooks {
    @JsonProperty
    private int id_author_books;
    @JsonProperty
    private int id_author;
    @JsonProperty
    private int id_book;

    @Override
    public String toString() {
        return "AuthorBooks{" +
                "id_author_books='" + id_author_books + '\'' +
                ", id_author='" + id_author + '\'' +
                ", id_book='" + id_book +
                '}';
    }
}