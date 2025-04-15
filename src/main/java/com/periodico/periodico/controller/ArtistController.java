package com.periodico.periodico.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.periodico.periodico.service.ArtistService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import com.periodico.periodico.model.Artist;

@RestController
@RequestMapping("/api/v1/artists")
public class ArtistController {
    private final ArtistService artistService;
    public ArtistController(ArtistService artistService){
        this.artistService = artistService; 

    }
   @PostMapping
    public ResponseEntity<Object> createArtist(@RequestBody Artist artist){
        return artistService.createArtist(artist);
    }
   }
    




