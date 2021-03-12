package com.example.demo.dao;

import com.example.demo.model.Book;

import java.util.List;

public interface BookDao  extends GeneralDao<Book>{

   List<Book> searchTopBooks(int limit);
}
