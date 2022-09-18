package ru.mylibr.LibraryTest.dao.mappers;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.entities.request.LibraryCard;

import java.util.List;

@Component
@Mapper
public interface LibraryCardMapper {

    @Insert("call savelibrarycard (i_id_reader            => #{in.id_reader, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                      i_id_author_books      => #{in.id_author_books, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                      i_refund               => #{in.refund, mode=IN, jdbcType=BOOLEAN, javaType=boolean},\n" +
            "                      i_return_date          => #{in.return_date, mode=IN, jdbcType=DATE, javaType=Date},\n" +
            "                      i_date_of_issue        => #{in.date_of_issue, mode=IN, jdbcType=DATE, javaType=Date})")
    @Options(statementType = StatementType.CALLABLE)
    void saveLibraryCardParams  (@Param("in") LibraryCard libraryCard);
    @Delete("call dellibrarycard( i_id_library_card        => #{i_id_library_card, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void delLibraryCardParams(@Param("i_id_library_card") int idLibraryCard);
    @Update("call updatelibrarycard (i_id_library_card      => #{in.id_library_card, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                        i_id_reader            => #{in.id_reader, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                        i_id_author_books      => #{in.id_author_books, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                        i_refund               => #{in.refund, mode=IN, jdbcType=BOOLEAN, javaType=boolean},\n" +
            "                        i_return_date          => #{in.return_date, mode=IN, jdbcType=DATE, javaType=Date},\n" +
            "                        i_date_of_issue        => #{in.date_of_issue, mode=IN, jdbcType=DATE, javaType=Date})")

    @Options(statementType = StatementType.CALLABLE)
    void updateLibraryCardParams  (@Param("in") LibraryCard libraryCard);
    @Select("select * from sellibrarycard()")
    @Results({
            @Result(property = "id_library_card", column = "id_library_card"),
            @Result(property = "id_reader", column = "id_reader"),
            @Result(property = "id_author_books", column = "id_author_books"),
            @Result(property = "refund", column = "refund"),
            @Result(property = "return_date", column = "return_date"),
            @Result(property = "date_of_issue", column = "date_of_issue")
    })
    List<LibraryCard> findAllLibraryCard();
}

