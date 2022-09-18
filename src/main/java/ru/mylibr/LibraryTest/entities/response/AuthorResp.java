package ru.mylibr.LibraryTest.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthorResp {

    @JsonProperty
    private int id_author;
    public int getIdAuthor() {
        return id_author;
    }
    public void setIdAuthor(int id_author) {
        this.id_author = id_author;
    }
    @JsonProperty
    private String author_name;
    public String getAuthorName() {
        return author_name;
    }
    public void setAuthorName(String author_name) {
        this.author_name = author_name;
    }

    public AuthorResp(int id_author, String author_name) {
        super();
        this.id_author = id_author;
        this.author_name = author_name;
    }

    public String toString() {
        return "Author{" +
                "id_author='" + id_author + '\'' +
                ", author_name='" + author_name +
                '}';
    }
}