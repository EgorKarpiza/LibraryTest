package ru.mylibr.LibraryTest.dao.mappers;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Component;
import ru.mylibr.LibraryTest.entities.request.Reader;

import java.util.List;

@Component
@Mapper
public interface ReaderMapper {

    @Insert("call savereader(i_full_name            => #{in.full_name, mode=IN, jdbcType=VARCHAR, javaType=String},\n" +
            "                i_addres               => #{in.addres, mode=IN, jdbcType=VARCHAR, javaType=String},\n" +
            "                i_phone_number         => #{in.phone_number, mode=IN, jdbcType=BIGINT, javaType=long})")

    @Options(statementType = StatementType.CALLABLE)
    void saveReaderParams  (@Param("in") Reader reader);
    @Delete("call delreader( i_id_reader         => #{i_id_reader, mode=IN, jdbcType=BIGINT, javaType=int})")
    @Options(statementType = StatementType.CALLABLE)
    void delReaderParams(@Param("i_id_reader") int idReader);
    @Update("call updatereader(i_id_reader            => #{in.id_reader, mode=IN, jdbcType=BIGINT, javaType=int},\n" +
            "                  i_full_name            => #{in.full_name, mode=IN, jdbcType=VARCHAR, javaType=String},\n" +
            "                  i_addres               => #{in.addres, mode=IN, jdbcType=VARCHAR, javaType=String},\n" +
            "                  i_phone_number         => #{in.phone_number, mode=IN, jdbcType=BIGINT, javaType=long})")
    @Options(statementType = StatementType.CALLABLE)
    void updateReaderParams(@Param("in") Reader reader);
    @Select("select * from selreader()")
    @Results({
            @Result(property = "id_reader", column = "id_reader"),
            @Result(property = "full_name", column = "full_name"),
            @Result(property = "addres", column = "addres"),
            @Result(property = "phone_number", column = "phone_number")
    })
    List<Reader> findAllReader();
}
