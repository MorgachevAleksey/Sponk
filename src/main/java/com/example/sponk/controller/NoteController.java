package com.example.sponk.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @GetMapping
    public String getAllNotes(){
        return "Notes";
    }
}
