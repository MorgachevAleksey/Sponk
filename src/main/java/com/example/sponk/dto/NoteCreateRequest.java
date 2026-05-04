package com.example.sponk.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record NoteCreateRequest(
        @NotBlank(message = "Must be not blank")
        @Size(min = 3, max = 100, message = "Wrong size")
        String title,

        @NotBlank(message = "Must be not blank")
        @Size(min = 5, max = 1000, message = "Wrong size")
        String content
) {
}
