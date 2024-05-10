package com.example.TodoList.controller;

import com.example.TodoList.view.NewNoteService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LoginController {

    @Autowired
    private NewNoteService newNoteService;

    @RequestMapping("/")
    public ModelAndView defaultHome(HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("allList");
        modelAndView.addObject("notes", newNoteService.listAll());
        return modelAndView;
    }

}
