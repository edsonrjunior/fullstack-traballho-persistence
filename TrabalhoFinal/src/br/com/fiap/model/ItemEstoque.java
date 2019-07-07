package br.com.fiap.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemEstoque implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemEstoquePK id = new ItemEstoquePK();

	private Integer quantidade;

	public ItemEstoque() {

	}

	public ItemEstoque(Produto produto, Integer quantidade) {
		id.setProduto(produto);
		this.quantidade = quantidade;
	}

	public ItemEstoquePK getId() {
		return id;
	}

	public void setId(ItemEstoquePK id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
