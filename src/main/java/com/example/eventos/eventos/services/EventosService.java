package com.example.eventos.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventos.eventos.entities.Eventos;
import com.example.eventos.eventos.repositories.EventosRepository;

@Service
public class EventosService {

    @Autowired
    private EventosRepository eventoRepo;

    public List<Eventos> listarTodos() {
        return eventoRepo.findAll();
    }

    public Eventos criar(Eventos evento) {
        return eventoRepo.save(evento);
    }

    public Eventos atualizar(Long id, Eventos eventoDados) {
        Eventos evento = eventoRepo.findById(id).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
        evento.setNome(eventoDados.getNome());
        evento.setDescricao(eventoDados.getDescricao());
        evento.setData(eventoDados.getData());
        evento.setLocal(eventoDados.getLocal());
        evento.setVagas(eventoDados.getVagas());
        return eventoRepo.save(evento);
    }

    public void excluir(Long id) {
        Eventos evento = eventoRepo.findById(id).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
        eventoRepo.delete(evento);
    }


}
