package com.example.TodoList.view;

import com.example.TodoList.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteDao {

    List<Note> listAll();

    Note add(Note note);

    Optional<Note> deleteById(long id);

    Optional<Note> getById(long id);

    Note update(Note updateNote);
}
