package com.example.sponk.controller;

import com.example.sponk.dto.MessageResponse;
import com.example.sponk.dto.NoteCreateRequest;
import com.example.sponk.dto.NoteResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @GetMapping
    public NoteResponse getAllNotes(){
        return new NoteResponse(1L, "1", "1");
    }

    @PostMapping
    public MessageResponse createNote(@Valid @RequestBody NoteCreateRequest request){
        return new MessageResponse("Note created");
    }
}
