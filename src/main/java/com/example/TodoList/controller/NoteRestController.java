package com.example.TodoList.controller;

import com.example.TodoList.mapper.NoteMapper;
import com.example.TodoList.model.Note;
import com.example.TodoList.view.NewNoteService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

    // Get note by id API JSON
    @GetMapping("/{id}")
    public ResponseEntity<List<Note>> getNotesById(@PathVariable("id") String id) {
        Note note = newNoteService.getById(Long.parseLong(id));
        Note noteResponse = noteMapper.toNoteResponse(note);
        return ResponseEntity.status(HttpStatus.OK).body(Collections.singletonList(noteResponse));
    }

    // Create new note API JSON
    @PostMapping
    public ResponseEntity<Note> addNewNote(@PathVariable Note newNote) {
        Note createNewNote = newNoteService.add(newNote);
        return ResponseEntity.status(HttpStatus.OK).body(createNewNote);
    }

    // Update note by id API JSON
    @PutMapping("/update/{id}")
    public ResponseEntity<Note> updateNotesById(@PathVariable("id") String id, @RequestBody Note note) {
        Note getNote = newNoteService.getById(Long.parseLong(id));
        if (getNote != note) {
            Note updateNoteById = newNoteService.update(Long.parseLong(id), note);
            return new ResponseEntity<>(updateNoteById, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete note by id API JSON
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteNoteById(@PathVariable("id") String id) {
        newNoteService.deleteById(Long.parseLong(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
