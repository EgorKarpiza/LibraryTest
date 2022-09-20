package ru.mylibr.LibraryTest.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReaderResp {

    @JsonProperty
    private int id_reader;
    public int getIdReader() {
        return id_reader;
    }
    public void setIdReader(int id_reader) {
        this.id_reader = id_reader;
    }
    @JsonProperty
    private String full_name;
    public String getFullName() {
        return full_name;
    }
    public void setFullName (String full_name) {
        this.full_name = full_name;
    }
    @JsonProperty
    private String addres;
    public String getAddres() {
        return addres;
    }
    public void setAddres (String addres) {
        this.addres = addres;
    }
    private long phone_number;
    public long getPhoneNumber() {
        return phone_number;
    }
    public void setPhoneNumber(long phone_number) {
        this.phone_number = phone_number;
    }

    public ReaderResp(int id_reader, String full_name, String addres, long phone_number ) {
        super();
        this.id_reader = id_reader;
        this.full_name = full_name;
        this.addres=addres;
        this.phone_number=phone_number;
    }

    public String toString() {
        return "Reader{" +
                "id_reader='" + id_reader + '\'' +
                ", full_name='" + full_name + '\'' +
                ", addres='" + addres + '\'' +
                ", phone_number='" + phone_number +
                '}';
    }
}