package com.example.TodoList.view;

import com.example.TodoList.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteDao {

    List<Note> listAll();

    Note add(Note note);

    void deleteById(long id);

    Note getById(long id);

    Note update(long id,Note updateNote);
}
