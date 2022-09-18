package ru.mylibr.LibraryTest.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Author {
    @JsonProperty
    private int id_author;
    @JsonProperty
    private String author_name;

    @Override
    public String toString() {
        return "Author{" +
                "id_author='" + id_author + '\'' +
                ", author_name='" + author_name +
                '}';
    }
}