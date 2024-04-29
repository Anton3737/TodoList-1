package com.example.TodoList.repository;

import com.example.TodoList.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
