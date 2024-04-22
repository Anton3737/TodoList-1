package com.example.TodoList.view;

import com.example.TodoList.model.Note;

import java.util.List;

public interface NoteDao {

    List<Note> listAll();

    Note add(Note note);

    void deleteById(String id);

    Note getById(String id);

    void update(Note updateNote);
}
