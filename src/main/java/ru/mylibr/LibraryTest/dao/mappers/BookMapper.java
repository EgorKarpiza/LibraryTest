package ru.mylibr.LibraryTest.dao.mappers;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.entities.request.Book;

import java.util.List;

@Component
@Mapper
public interface BookMapper {

    @Insert("call savebook(i_title            => #{in.title, mode=IN, jdbcType=VARCHAR, javaType=String},\n" +
            "              i_number_of_pages  => #{in.number_of_pages, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void saveBookParams  (@Param("in")Book book);
    @Delete("call delbook( i_id_book         => #{i_id_book, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void delBookParams(@Param("i_id_book") int idBook);
    @Update("call updatebook(i_id_book            => #{in.id_book, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                i_title              => #{in.title, mode=IN, jdbcType=VARCHAR, javaType=String},\n" +
            "                i_number_of_pages    => #{in.number_of_pages, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void updateBookParams(@Param("in") Book book);
    @Select("select * from selbook()")
    @Results({
            @Result(property = "id_book", column = "id_book"),
            @Result(property = "title", column = "title"),
            @Result(property = "number_of_pages", column = "number_of_pages")
    })
    List<Book> findAllBook();
}
