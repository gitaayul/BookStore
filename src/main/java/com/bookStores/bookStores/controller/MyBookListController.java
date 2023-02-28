package com.bookStores.bookStores.controller;

import com.bookStores.bookStores.entity.MyBookList;
import com.bookStores.bookStores.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyBookListController {

    @Autowired
    private MyBookService myBookService;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        myBookService.deleteById(id);
        return "redirect:/my_books";
    }

    @RequestMapping("/sortMyBooks")
    public List<String> sortMyBooks(MyBookList myBookList) {
        List<String> myBookListList = Arrays.asList(myBookList.getName());
        List<String> sortList = myBookListList.stream().sorted().collect(Collectors.toList());
        return sortList;
    }
}
