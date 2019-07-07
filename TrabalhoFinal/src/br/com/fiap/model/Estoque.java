package br.com.fiap.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Estoque implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;

	@OneToMany(mappedBy = "id.produto")
	private Set<ItemEstoque> itens = new HashSet<>();

	public Estoque() {
	}

	public Estoque(Produto produto) {
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<ItemEstoque> getItens() {
		return itens;
	}

	public void setItens(Set<ItemEstoque> itens) {
		this.itens = itens;
	}

}