package com.sz.multipledatasouse.mapper2;

import com.sz.multipledatasouse.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper2 {
    @Select("select * from t_book")
    List<Book> getAllBooks();
}
