package com.example.TodoList.mapper;

import com.example.TodoList.model.Note;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class NoteMapper {

    public Note toNoteResponse(Note dto) {
        Note response = new Note();
        response.setId(dto.getId());
        response.setTitle(dto.getTitle());
        response.setContent(dto.getContent());
        return response;
    }


    public List<Note> toNoteResponses(Collection<Note> dtos) {
        return dtos.stream()
                .map(this::toNoteResponse).collect(Collectors.toList());
    }



}
