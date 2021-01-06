package com.sz.multipledatasource.dao1;

import com.sz.multipledatasource.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao1 extends JpaRepository<Book,Integer> {

}
