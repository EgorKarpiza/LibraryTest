package ru.mylibr.LibraryTest.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Book {
    @JsonProperty
    private int id_book;
    @JsonProperty
    private String title;
    @JsonProperty
    private int number_of_pages;

  @Override
  public String toString() {
    return "Book{" +
            "id_book=" + id_book +
            ", title='" + title + '\'' +
            ", number_of_pages=" + number_of_pages +
            '}';
  }
}