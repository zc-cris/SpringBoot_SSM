package com.cris.controller;

import com.cris.entity.Book;
import com.cris.service.BookServiceImpl;
import com.cris.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试controller
 *
 * @author zc-cris
 */
@Controller
public class TestController {

    private final
    BookServiceImpl bookService;
    private final
    UserServiceImpl userService;

    @Autowired
    public TestController(BookServiceImpl bookService, UserServiceImpl userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    @PutMapping("/buy")
    public String buyBook(HttpServletRequest request) {
        String pageStr;
        Integer id = Integer.valueOf(request.getParameter("id"));
        Integer isbn = Integer.valueOf(request.getParameter("isbn"));

        try {
            userService.buyOneBook(id, isbn);
            pageStr = "success";
        } catch (Exception e) {
            e.printStackTrace();
            pageStr = "failed";
        }
        return pageStr;
    }

    @GetMapping("/getBook/{isbn}")
    @ResponseBody
    public Book getUser(@PathVariable("isbn") Integer isbn) {
        return bookService.getBookByIsbn(isbn);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
