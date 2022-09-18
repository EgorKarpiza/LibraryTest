package ru.mylibr.LibraryTest.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Date;

@Data
public class LibraryCardResp {

    @JsonProperty
    private int id_library_card;
    public int getIdLibraryCard() {
        return id_library_card;
    }
    public void setIdLibraryCard(int id_library_card) {
        this.id_library_card = id_library_card;
    }
    @JsonProperty
    private int id_reader;
    public int getIdReader() {
        return id_reader;
    }
    public void setIdReader(int id_reader) {
        this.id_reader = id_reader;
    }
    @JsonProperty
    private int id_author_books;
    public int getIdAuthorBooks() {
        return id_author_books;
    }
    public void setIdAuthorBooks(int id_author_books) {
        this.id_author_books = id_author_books;
    }
    @JsonProperty
    private boolean refund;
    public boolean getRefund() {
        return refund;
    }
    public void setRefund(boolean refund) {
        this.refund = refund;
    }
    @JsonProperty
    private Date return_date;
    public Date getReturnDate() {
        return return_date;
    }
    public void setReturnDate(Date return_date) {
        this.return_date = return_date;
    }
    @JsonProperty
    private Date date_of_issue;
    public Date getDateOfIssue() {
        return date_of_issue;
    }
    public void setDateOfIssue(Date date_of_issue) {
        this.date_of_issue = date_of_issue;
    }

    public LibraryCardResp(int id_library_card, int id_reader, int id_author_books, boolean refund, Date return_date, Date date_of_issue) {
        super();
        this.id_library_card = id_library_card;
        this.id_reader = id_reader;
        this.id_author_books=id_author_books;
        this.refund = refund;
        this.return_date = return_date;
        this.date_of_issue = date_of_issue;
    }

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