package com.example.TodoList.controller;

import com.example.TodoList.view.NewNoteService;
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
    private NewNoteService newNoteService;

    // Read

    @GetMapping("/list")
    public ModelAndView getAllNotes() {
        ModelAndView modelAndView = new ModelAndView("allList");
        modelAndView.addObject("notes", newNoteService.listAll());
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
        newNoteService.add(newNote);
        return new ModelAndView("redirect:/notes/list");
    }

    @PostMapping("/update")
    public ModelAndView updateNote(@RequestParam long id, @RequestParam String title, @RequestParam String content) {
        Note updateNote = new Note();
        updateNote.setId(id);
        updateNote.setTitle(title);
        updateNote.setContent(content);
        newNoteService.update(updateNote);
        return new ModelAndView("redirect:/notes/list");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showUpdateNoteForm(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("note", newNoteService.getById(id));
        return modelAndView;
    }

    // Delete
    @GetMapping("/delete/{id}")
    public ModelAndView deleteNote(@PathVariable long id) {
        newNoteService.deleteById(id);
        return new ModelAndView("redirect:/notes/list");
    }


}
