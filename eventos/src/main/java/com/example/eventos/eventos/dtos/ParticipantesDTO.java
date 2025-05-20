package com.example.eventos.eventos.dtos;

import java.util.Set;

import com.example.eventos.eventos.entities.Participantes;

public class ParticipantesDTO {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private Set<Long> eventosids;
	
	public ParticipantesDTO() {
	
	}
	
	public ParticipantesDTO(Long id, String nome, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public ParticipantesDTO(Participantes p) {
		id = p.getId();
		nome = p.getNome();
		email = p.getEmail();
		telefone = p.getTelefone();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Set<Long> getEventosids() {
		return eventosids;
	}
	public void setEventosids(Set<Long> eventosids) {
		this.eventosids = eventosids;
	}

}
