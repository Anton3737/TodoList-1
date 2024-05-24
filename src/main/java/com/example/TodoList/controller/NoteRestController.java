package com.example.TodoList.controller;

import com.example.TodoList.TodoListApplication;
import com.example.TodoList.mapper.NoteMapper;
import com.example.TodoList.model.Note;
import com.example.TodoList.view.NewNoteService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Validated
@Controller
@RequestMapping("/api/notes")
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
    public ResponseEntity<List<Note>> getNotesById(@PathVariable("id") long id) {
        Note note = newNoteService.getById(id);
        Note noteResponse = noteMapper.toResponseDTO(note);
        return ResponseEntity.status(HttpStatus.OK).body(Collections.singletonList(noteResponse));
    }

    // Create new note API JSON
    @PostMapping("/addNote")
    public ResponseEntity<Note> addNewNote(@RequestParam String title, @RequestParam String content) {
        Note note = new Note(title, content);
        note.setTitle(title);
        note.setContent(content);
        newNoteService.add(noteMapper.fromNoteDTO(note));
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(noteMapper.toResponseDTO(note));
    }

    // Update note by id API JSON

    @PostMapping("/update/{id}")
    public ResponseEntity<Note> updateNotesById(@PathVariable("id") long id, @RequestBody Note note) {
        Note existingNote = newNoteService.getById(id);
        if (existingNote != null) {
            Note updatedNote = newNoteService.update(id, note);
            return new ResponseEntity<>(updatedNote, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete note by id API JSON
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNoteById(@RequestParam long id) {
        newNoteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
