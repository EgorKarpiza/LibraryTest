
package ru.mylibr.LibraryTest.dao.mappers;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.entities.request.AuthorBooks;

import java.util.List;

@Component
@Mapper
public interface AuthorBooksMapper{

    @Insert("call saveauthorbooks(i_id_author       => #{in.id_author, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                     i_id_book         => #{in.id_book, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void saveAuthorBooksParams  (@Param("in") AuthorBooks authorbooks);
    @Delete("call delauthorbooks( i_id_author_books         => #{i_id_author_books, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void delAuthorBooksParams(@Param("i_id_author_books") int idAuthorBooks);
    @Update("call updateauthorbooks(i_id_author_books    => #{in.id_author_books, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                       i_id_author          => #{in.id_author, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                       i_id_book            => #{in.id_book, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void updateAuthorBooksParams(@Param("in") AuthorBooks authorBooks);
    @Select("select * from selauthorbooks()")
    @Results({
            @Result(property = "id_author_books", column = "id_author_books"),
            @Result(property = "id_author", column = "id_author"),
            @Result(property = "id_book", column = "id_book")
    })
    List<AuthorBooks> findAllAuthorBooks();
}


