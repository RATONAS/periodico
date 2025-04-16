package com.periodico.periodico.service;

import java.util.List;
import java.util.Optional;

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

public List<Songs> getAllSongs() {
        return periodicoRepository.findAll();
    }

    public ResponseEntity<Object> getSongById(int id) {
        Optional<Songs> song = periodicoRepository.findById(id);
        if (song.isPresent()) {
            return new ResponseEntity<>(song.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Song not found", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> updateSong(int id, Songs songDetails) {
        Optional<Songs> optionalSong = periodicoRepository.findById(id);
        if (optionalSong.isPresent()) {
            Songs song = optionalSong.get();
            song.setTitle(songDetails.getTitle());
            song.setArtist(songDetails.getArtist());
            song.setRelease(songDetails.getRelease());
            song.setLyrics(songDetails.getLyrics());
            song.setTopic(songDetails.getTopic());
            periodicoRepository.save(song);
            return new ResponseEntity<>(song, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Song not found", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> deleteSong(int id) {
        Optional<Songs> optionalSong = periodicoRepository.findById(id);
        if (optionalSong.isPresent()) {
            periodicoRepository.delete(optionalSong.get());
            return new ResponseEntity<>("Song deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Song not found", HttpStatus.NOT_FOUND);
        }
    }
    
}
