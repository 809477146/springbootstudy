package com.sz.multipledatasouse.mapper1;

import com.sz.multipledatasouse.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper1 {
    @Select("select * from t_book")
    List<Book> getAllBooks();
}

