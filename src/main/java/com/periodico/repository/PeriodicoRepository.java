package com.periodico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.periodico.model.Songs;

public interface PeriodicoRepository extends JpaRepository<Songs, Integer> {}

