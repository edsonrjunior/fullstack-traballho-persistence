package br.com.fiap.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemEstoquePK implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
