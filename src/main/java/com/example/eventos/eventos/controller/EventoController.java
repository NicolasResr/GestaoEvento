package com.example.eventos.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventos.eventos.entities.Eventos;
import com.example.eventos.eventos.services.EventosService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventosService eventosService;

    @GetMapping
    public List<Eventos> listar() {
        return eventosService.listarTodos();
    }

    @PostMapping
    public Eventos criar(@RequestBody Eventos evento) {
        return eventosService.criar(evento);
    }

    @PutMapping("/{id}")
    public Eventos atualizar(@PathVariable Long id, @RequestBody Eventos evento) {
        return eventosService.atualizar(id, evento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        eventosService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}