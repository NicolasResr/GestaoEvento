package com.example.eventos.eventos.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.eventos.eventos.entities.Participantes;
import com.example.eventos.eventos.services.ParticipantesService;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipantesService participanteService;

    @PostMapping
    public Participantes criar(@RequestBody Participantes participante) {
        return participanteService.criar(participante);
    }

    @PostMapping("/{participanteId}/inscrever/{eventoId}")
    public ResponseEntity<String> inscrever(@PathVariable Long participanteId, @PathVariable Long eventoId) {
        participanteService.inscreverEvento(participanteId, eventoId);
        return ResponseEntity.ok("Inscrição realizada");
    }

    @DeleteMapping("/{participanteId}/cancelar/{eventoId}")
    public ResponseEntity<String> cancelarInscricao(@PathVariable Long participanteId, @PathVariable Long eventoId) {
        participanteService.cancelarInscricao(participanteId, eventoId);
        return ResponseEntity.ok("Inscrição cancelada");
    }

    @GetMapping("/evento/{eventoId}")
    public Set<Participantes> listarParticipantes(@PathVariable Long eventoId) {
        return participanteService.listarParticipantes(eventoId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarParticipante(@PathVariable Long id) {
        participanteService.deletarParticipante(id);
        return ResponseEntity.ok("Participante excluído com sucesso");
    }
}

