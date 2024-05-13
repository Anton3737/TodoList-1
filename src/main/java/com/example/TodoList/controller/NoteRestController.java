package com.example.TodoList.controller;

import com.example.TodoList.mapper.NoteMapper;
import com.example.TodoList.model.Note;
import com.example.TodoList.view.NewNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Validated
@Controller
@RequestMapping("/rest")
public class NoteRestController {

    private static final String Extantion = "json";

    @Autowired
    private NewNoteService newNoteService;
    @Autowired
    private NoteMapper noteMapper;



    // Get All list API JSON
    @GetMapping("/restList")
    public ResponseEntity<List<Note>> noteList() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(noteMapper.toNoteResponses(newNoteService.listAll()));
    }




}
