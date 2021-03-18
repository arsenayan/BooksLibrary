package com.example.demo.services.dao;

import com.example.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

//here we will write specific behavior of Book
public interface BookDao  extends GeneralDao<Book>{

	// searching trending books
   List<Book> searchTopBooks(int limit);
   
   // getting content by id
   byte[] getContent(long id);
   
   // getting genre by paging
   Page<Book> findByGenre(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, long genreId);
}
