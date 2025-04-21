package com.periodico.periodico.controller;
import org.springframework.web.bind.annotation.*;
import com.periodico.periodico.service.ArtistService;
import jakarta.validation.Valid;
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
public ResponseEntity<Object> createArtist(@Valid @RequestBody Artist artist){
return artistService.createArtist(artist);
}
@GetMapping
public ResponseEntity<Object> getAllArtists(@RequestParam(required = false) String title) {
return ResponseEntity.ok(artistService.getAllArtists());
} 
@GetMapping("/{id}")
public ResponseEntity<Object> getArtistById(@PathVariable int id) {
return artistService.getArtistById(id);
}

@PutMapping("/{id}")
public ResponseEntity<Artist> updateArtist(@PathVariable int id, @Valid @RequestBody Artist artistDetails) {
    return artistService.updateArtist(id, artistDetails)
            .map(updated -> ResponseEntity.ok(updated))
            .orElseGet(() -> ResponseEntity.notFound().build());
}
@DeleteMapping("/{id}")
public ResponseEntity<Object> deleteArtist(@PathVariable int id) {
return artistService.deleteArtist(id);
}

}




