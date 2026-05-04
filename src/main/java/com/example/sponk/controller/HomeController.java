package com.example.sponk.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.sponk.dto.MessageResponse;

@RestController
public class HomeController {

    @GetMapping
    public MessageResponse home(){
        return new MessageResponse("Sponk");
    }
}