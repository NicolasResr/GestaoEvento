package com.example.eventos.eventos.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "tb_eventos")
@Entity
public class Eventos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private LocalDate data;
	private String local;
	private int vagas;
	
	@ManyToMany
	@JoinTable(name = "evento_participante", joinColumns = @JoinColumn(name = "evento_id"),
	inverseJoinColumns = @JoinColumn(name = "participantes_id"))
	private Set<Participantes> participantes = new HashSet<>();
	
	public Eventos() {
		
	}
	
	public Eventos(Long id,String nome, String descricao, LocalDate data, String local, int vagas,
			Set<Participantes> participantes) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.local = local;
		this.vagas = vagas;
		this.participantes = participantes;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public Set<Participantes> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Set<Participantes> participantes) {
		this.participantes = participantes;
	}
}
