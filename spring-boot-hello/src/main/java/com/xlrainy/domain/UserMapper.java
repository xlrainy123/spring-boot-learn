package com.xlrainy.domain;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USER(NAME,AGE) VALUES(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Select("SELECT * FROM USER WHERE NAME=#{name}")
    @Results({
                @Result(column = "name",property = "name"),
                @Result(column = "age",property = "age")
            })
    User findByName(@Param("name") String name);
}
