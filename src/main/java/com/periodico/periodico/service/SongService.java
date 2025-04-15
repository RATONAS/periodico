package com.periodico.periodico.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.periodico.periodico.model.Songs;

import com.periodico.periodico.repository.PeriodicoRepository;

@Service
public class SongService {
    private final PeriodicoRepository periodicoRepository;

    public SongService(PeriodicoRepository periodicoRepository){
        this.periodicoRepository = periodicoRepository;
    }

    public ResponseEntity<Object> createSong(Songs song){
        periodicoRepository.save(song);
        return new ResponseEntity<>(song, HttpStatus.CREATED);
    }

    
}
