package com.example.eventos.eventos.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventos.eventos.entities.Eventos;
import com.example.eventos.eventos.entities.Participantes;
import com.example.eventos.eventos.repositories.EventosRepository;
import com.example.eventos.eventos.repositories.ParticipantesRepository;

@Service
public class ParticipantesService {

    @Autowired
    private ParticipantesRepository participanteRepo;

    @Autowired
    private EventosRepository eventoRepo;

    public Participantes criar(Participantes participante) {
        return participanteRepo.save(participante);
    }

    public void inscreverEvento(Long participanteId, Long eventoId) {
        Participantes participante = participanteRepo.findById(participanteId)
            .orElseThrow(() -> new RuntimeException("Participante não encontrado"));
        Eventos evento = eventoRepo.findById(eventoId)
            .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

        if (evento.getParticipantes().size() >= evento.getVagas())
            throw new RuntimeException("Não há vagas disponíveis");

        if (!evento.getParticipantes().add(participante))
            throw new RuntimeException("Participante já inscrito");

        eventoRepo.save(evento);
    }

    public void cancelarInscricao(Long participanteId, Long eventoId) {
        Participantes participante = participanteRepo.findById(participanteId)
            .orElseThrow(() -> new RuntimeException("Participante não encontrado"));
        Eventos evento = eventoRepo.findById(eventoId)
            .orElseThrow(() -> new RuntimeException("Evento não encontrado"));

        if (!evento.getParticipantes().remove(participante))
            throw new RuntimeException("Participante não está inscrito");

        eventoRepo.save(evento);
    }

    public Set<Participantes> listarParticipantes(Long eventoId) {
        Eventos evento = eventoRepo.findById(eventoId)
            .orElseThrow(() -> new RuntimeException("Evento não encontrado"));
        return evento.getParticipantes();
    }
}
