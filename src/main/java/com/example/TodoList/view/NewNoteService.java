package com.example.TodoList.view;


import com.example.TodoList.model.Note;
import com.example.TodoList.repository.NoteRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Data
public class NewNoteService implements NoteDao {
    @Autowired
    private final NoteRepository noteRepository;


    @Override
    public List<Note> listAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note add(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Optional<Note> deleteById(long id) {
        return noteRepository.findById(id);
    }

    @Override
    public Optional<Note> getById(long id) {
        return noteRepository.findById(id);
    }


    @Override
    public Note update(Note updateNote) {
        Note note = new Note();
        note.setTitle(updateNote.getTitle());
        note.setContent(updateNote.getContent());
        noteRepository.save(note);
        return note;
    }
}
