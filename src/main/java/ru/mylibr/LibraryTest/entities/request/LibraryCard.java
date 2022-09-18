package ru.mylibr.LibraryTest.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

;

@Data
@Getter
@Setter
public class LibraryCard {
    @JsonProperty
    private int id_library_card;
    @JsonProperty
    private int id_reader;
    @JsonProperty
    private int id_author_books;
    @JsonProperty
    private boolean refund;
    @JsonProperty
    private Date return_date;
    @JsonProperty
    private Date date_of_issue;


    @Override
    public String toString() {
        return "LibraryCard{" +
                "id_library_card='" + id_library_card + '\'' +
                ", id_reader='" + id_reader + '\'' +
                ", id_author_books='" + id_author_books + '\'' +
                ", refund='" + refund + '\'' +
                ", return_date='" + return_date + '\'' +
                ", date_of_issue='" + date_of_issue +
                '}';
    }
}