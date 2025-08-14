package com.boot.example.service;

import com.boot.example.domain.Book;
import com.boot.example.mapper.BookMapper;

import java.util.List;

public interface BookService {
    public List<Book> bookList();
}
