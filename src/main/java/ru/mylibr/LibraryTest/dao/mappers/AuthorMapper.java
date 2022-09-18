package ru.mylibr.LibraryTest.dao.mappers;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.entities.request.Author;

import java.util.List;

@Component
@Mapper
public interface AuthorMapper {

    @Insert("call saveauthor(i_author_name   => #{in.author_name, mode=IN ,jdbcType=VARCHAR, javaType=String})")
    @Options(statementType = StatementType.CALLABLE)
    void saveAuthorParams(@Param("in") Author author);
    @Delete ("call delauthor( i_id_author         => #{i_id_author, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void delAuthorParams(@Param("i_id_author") int idAuthor);
    @Update("call updateauthor(i_id_author            => #{in.id_author, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                  i_author_name          => #{in.author_name, mode=IN, jdbcType=VARCHAR, javaType=String})")
    @Options(statementType = StatementType.CALLABLE)
    void updateAuthorParams(@Param("in") Author author);
    @Select("select * from selauthor()")
    @Results({
            @Result(property = "id_author", column = "id_author"),
            @Result(property = "author_name", column = "author_name")
    })
    List<Author> findAllAuthor();
}
