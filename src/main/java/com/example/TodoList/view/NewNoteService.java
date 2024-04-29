package com.example.TodoList.view;


import com.example.TodoList.model.Note;
import com.example.TodoList.repository.NoteRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void deleteById(long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Note getById(long id) {
        return noteRepository.getReferenceById(id);
    }

    @Override
    public Note update(long id,Note updateNote) {
        Note note = noteRepository.getReferenceById(id);
        note.setTitle(updateNote.getTitle());
        note.setContent(updateNote.getContent());
        noteRepository.save(note);
        return note;
    }
}
