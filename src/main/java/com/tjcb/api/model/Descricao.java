package com.tjcb.api.model;

import java.sql.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class Descricao {

	private Float valor;
	
	private Date dataHora;
	
	private String estabelecimento;

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
	
}
