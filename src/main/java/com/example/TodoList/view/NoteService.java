package com.example.TodoList.view;

import com.example.TodoList.model.Note;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


@RequiredArgsConstructor
@Service
@Data
public class NoteService implements NoteDao {
    public List<Note> myNotes = new ArrayList<>();


    @Override
    public List<Note> listAll() {
        return this.myNotes;
    }

    @Override
    public Note add(Note note) {
        UUID id = UUID.randomUUID();
        note.setId(id.toString());
        this.myNotes.add(note);
        return note;
    }

    @Override
    public void deleteById(String id) {
        myNotes.removeIf(note -> note.getId().equals(id));
    }

    @Override
    public Note getById(String id) {
        return myNotes.stream().filter(note -> note.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void update(Note updateNote) {
        Note existingNote = getById(updateNote.getId());
        if (existingNote != null) {
            existingNote.setTitle(updateNote.getTitle());
            existingNote.setContent(updateNote.getContent());
        } else {
            System.out.println("Note doesn't exist.");
        }
    }
}



//    private static final String GET_TASK_BY_ID = "";
//    public static final String INSERT_TASK = "";
//    private static final String UPDATE_TASK = "";
//    private static final String DELETE_TASK = "";
//    private static final String SELECT_ALL_TASKS = "";

