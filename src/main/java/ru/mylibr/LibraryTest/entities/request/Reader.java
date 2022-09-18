package ru.mylibr.LibraryTest.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Reader {
    @JsonProperty
    private int id_reader;
    @JsonProperty
    private String full_name;
    @JsonProperty
    private String addres;
    @JsonProperty
    private double phone_number;

    @Override
    public String toString() {
        return "Reader{" +
                "id_reader='" + id_reader + '\'' +
                ", full_name='" + full_name + '\'' +
                ", addres='" + addres + '\'' +
                ", phone_number='" + phone_number +
                '}';
    }
}