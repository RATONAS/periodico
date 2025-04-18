package com.periodico.periodico.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.periodico.periodico.model.Artist;
import com.periodico.periodico.model.Songs;
import com.periodico.periodico.repository.ArtistRepository;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    /* public ResponseEntity<Object> createArtist(Artist artist){
        artistRepository.save(artist);
        return new ResponseEntity<>(artist, HttpStatus.CREATED);
    } */

    public ResponseEntity<Object> createArtist(Artist artist) {
        // Asegúrate de que las canciones estén correctamente asociadas al artista
        for (Songs song : artist.getSongs()) {
            song.setArtist(artist);
        }
        Artist savedArtist = artistRepository.save(artist);
        return new ResponseEntity<>(savedArtist, HttpStatus.CREATED);
    }




}






