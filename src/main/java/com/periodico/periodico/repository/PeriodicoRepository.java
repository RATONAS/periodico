package com.periodico.periodico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.periodico.periodico.model.Song;

public interface PeriodicoRepository extends JpaRepository<Song, Integer> {}

