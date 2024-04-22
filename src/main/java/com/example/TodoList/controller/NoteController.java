package com.example.TodoList.controller;

import com.example.TodoList.view.NoteService;
import com.example.TodoList.model.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;


@Controller
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    // Read
    @GetMapping("/list")
    public ModelAndView getAllNotes() {
        ModelAndView modelAndView = new ModelAndView("allList");
        modelAndView.addObject("notes", noteService.listAll());
        return modelAndView;
    }

    // Create
    @GetMapping("/create")
    public ModelAndView showCreateNoteForm() {
        return new ModelAndView("create");
    }

    @PostMapping("/create")
    public ModelAndView createNewNote(@RequestParam String title, @RequestParam String content) {
        Note newNote = new Note();
        newNote.setTitle(title);
        newNote.setContent(content);
        noteService.add(newNote);
        return new ModelAndView("redirect:/notes/list");
    }

    @PostMapping("/update")
    public ModelAndView updateNote(@RequestParam String id, @RequestParam String title, @RequestParam String content) {
        Note updateNote = new Note();
        updateNote.setId(id);
        updateNote.setTitle(title);
        updateNote.setContent(content);
        noteService.update(updateNote);
        return new ModelAndView("redirect:/notes/list");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showUpdateNoteForm(@PathVariable String id) {
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("note", noteService.getById(id));
        return modelAndView;
    }

    // Delete
    @GetMapping("/delete/{id}")
    public ModelAndView deleteNote(@PathVariable String id) {
        noteService.deleteById(id);
        return new ModelAndView("redirect:/notes/list");
    }


}
