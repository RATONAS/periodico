package com.periodico.periodico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.periodico.periodico.model.Artist;

public interface ArtistRepository extends JpaRepository <Artist, Integer> {     

    
}
