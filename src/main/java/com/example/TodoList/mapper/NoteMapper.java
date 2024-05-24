package com.example.TodoList.mapper;

import com.example.TodoList.model.Note;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class NoteMapper {

    public Note toResponseDTO(Note note) {
        if (note == null) {
            throw new NullPointerException("Note is null");
        }
        Note responseDTO = new Note();
        responseDTO.setId(note.getId());
        responseDTO.setTitle(note.getTitle());
        responseDTO.setContent(note.getContent());
        return responseDTO;
    }

    public List<Note> toNoteResponses(List<Note> notes) {
        return notes.stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }


    public Note fromNoteDTO(Note noteDTO) {
        return new Note(noteDTO.getTitle(), noteDTO.getContent());
    }


}
