package com.periodico.periodico.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.periodico.periodico.model.Artist;
import com.periodico.periodico.repository.ArtistRepository;

@Service
public class ArtistService {
private final ArtistRepository artistRepository;

public ArtistService(ArtistRepository artistRepository){
this.artistRepository = artistRepository;
}

public ResponseEntity<Object> createArtist(Artist artist){
artistRepository.save(artist);
return new ResponseEntity<>(artist, HttpStatus.CREATED);
}
public List<Artist> getAllArtists() {
return artistRepository.findAll();
}

public ResponseEntity<Object> getArtistById(int id) {
Optional<Artist> artist = artistRepository.findById(id);
if (artist.isPresent()) {
return new ResponseEntity<>(artist.get(), HttpStatus.OK);
} else {
return new ResponseEntity<>("Artist not found", HttpStatus.NOT_FOUND);
}
}
public Optional<Artist> updateArtist(int id, Artist artistDetails) {
    return artistRepository.findById(id).map(artist -> {
        artist.setArtistName(artistDetails.getArtistName());
        artist.setCountry(artistDetails.getCountry());
        artist.setIsActive(artistDetails.isActive());
        artist.setEmail(artistDetails.getEmail());
        return artistRepository.save(artist);
    });
}

public ResponseEntity<Object> deleteArtist(int id) {
Optional<Artist> optionalArtist = artistRepository.findById(id);
if (optionalArtist.isPresent()) {
artistRepository.delete(optionalArtist.get());
return new ResponseEntity<>("Artist deleted successfully", HttpStatus.OK);
} else {
return new ResponseEntity<>("Artist not found", HttpStatus.NOT_FOUND);
}
}



}