package com.periodico.periodico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.periodico.periodico.model.Songs;
import com.periodico.periodico.service.SongService;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {
    
    private final SongService songService; 
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public ResponseEntity<Object> createSong(@RequestBody Songs song) {
        return songService.createSong(song);
    }
}