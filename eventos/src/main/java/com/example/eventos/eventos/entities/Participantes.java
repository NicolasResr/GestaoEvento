package com.example.eventos.eventos.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "tb_participantes")
@Entity
public class Participantes {
	
	private String nome;
	private String email;
	private String telefone;
	
	@ManyToMany(mappedBy = "participantes")
	private Set<Eventos> eventos = new HashSet<>();
	
	public Participantes() {
		
	}

	public Participantes(String nome, String email, String telefone, Set<Eventos> eventos) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.eventos = eventos;
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

	public Set<Eventos> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Eventos> eventos) {
		this.eventos = eventos;
	}

}
