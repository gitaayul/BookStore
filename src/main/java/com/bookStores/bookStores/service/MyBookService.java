package com.bookStores.bookStores.service;

import com.bookStores.bookStores.entity.MyBookList;
import com.bookStores.bookStores.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookService {

    @Autowired
    private MyBookRepository bookRepository;

    public void saveMyBooks(MyBookList myBookList) {
        bookRepository.save(myBookList);
    }

    public List<MyBookList> getAllMyBooks() {
        return bookRepository.findAll();
    }

    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }
}
