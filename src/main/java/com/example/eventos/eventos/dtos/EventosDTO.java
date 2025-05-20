package com.example.eventos.eventos.dtos;

import java.time.LocalDate;
import java.util.Set;

public class EventosDTO {
	
	private Long id;
	private String nome;
	private String descricao;
	private LocalDate data;
	private String local;
	private int vagas;
	private Set<Long> participanteids;
	
	public EventosDTO() {
	
	}
	
	public EventosDTO(Long id, String nome, String descricao, LocalDate data, String local, int vagas) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.local = local;
		this.vagas = vagas;
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
	public Set<Long> getParticipanteids() {
		return participanteids;
	}
	public void setParticipanteids(Set<Long> participanteids) {
		this.participanteids = participanteids;
	}

}
