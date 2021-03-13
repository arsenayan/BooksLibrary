package com.example.demo.spring.controller;

import com.example.demo.spring.repository.AuthorRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Log
public class RedirectController {

    @Autowired
    private AuthorRepository authorRepository;


    @RequestMapping(value = "",method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse response){
       // List<Author> authorList =authorRepository.findAll();

//        Page<Author> pageList =  authorRepository.findByFioContainingIgnoreCaseOrderByFio("a",
//                new PageRequest(0,10, new Sort(Sort.DEFAULT_DIRECTION,"fio")));
        return "ok";
    }

}
