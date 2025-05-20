package com.example.eventos.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventos.eventos.entities.Participantes;

@Repository
public interface ParticipantesRepository extends JpaRepository<Participantes, Long> {

}
