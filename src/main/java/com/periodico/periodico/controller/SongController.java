package com.periodico.periodico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.periodico.periodico.model.Songs;
import com.periodico.periodico.service.SongService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {
    
    private final SongService songService; 
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public ResponseEntity<Object> createSong(@Valid @RequestBody Songs song) {
        return songService.createSong(song);
    }
    
    @GetMapping
    public ResponseEntity<Object> getAllSongs(@RequestParam(required = false) String title) {
     
        return ResponseEntity.ok(songService.getAllSongs());
        } 
    @GetMapping("/{id}")
    public ResponseEntity<Object> getSongById(@PathVariable int id) {
        return songService.getSongById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateSong(@PathVariable  int id, @Valid @RequestBody Songs songDetails) {
        return songService.updateSong(id, songDetails);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSong(@PathVariable  int id) {
        return songService.deleteSong(id);
    }
}
