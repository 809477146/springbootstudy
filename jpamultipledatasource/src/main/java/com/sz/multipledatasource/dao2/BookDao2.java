package com.sz.multipledatasource.dao2;

import com.sz.multipledatasource.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao2 extends JpaRepository<Book,Integer> {
}
