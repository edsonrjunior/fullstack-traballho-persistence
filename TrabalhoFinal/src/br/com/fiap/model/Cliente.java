package br.com.fiap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String cpf;
	private String celular;
	private String logradouro;
	private Integer numero;
	private Integer cep;
	private String cidade;
	private String uf;

	@OneToMany
	private List<Pedido> pedidos = new ArrayList<>();

	public Cliente() {

	}

	public Cliente(Integer id, String nome, String cpf, String celular, String logradouro, Integer numero, Integer cep,
			String cidade, String uf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void addPedidos(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void removePedidos(Pedido pedido) {
		pedidos.remove(pedido);
	}

}
