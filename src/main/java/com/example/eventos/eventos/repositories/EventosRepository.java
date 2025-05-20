package com.example.eventos.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventos.eventos.entities.Eventos;

@Repository
public interface EventosRepository extends JpaRepository<Eventos, Long> {

}
