package com.periodico.periodico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.periodico.periodico.model.Songs;

public interface PeriodicoRepository extends JpaRepository<Songs, Integer> {}

