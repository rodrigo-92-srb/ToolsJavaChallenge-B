package com.tjcb.api.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class FormaPagamento {
	
	private Tipo tipo;
	
	private int parcelas;

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
}
