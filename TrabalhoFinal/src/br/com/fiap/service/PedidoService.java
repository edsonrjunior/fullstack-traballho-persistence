package br.com.fiap.service;

import java.util.Collection;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteRepository;

@Component
public class PedidoService {
	@Autowired
	private ClienteRepository pedidoRepository;

	public void add(Cliente pedido) {
		pedidoRepository.save(pedido);
	}

	@Transactional
	public List<Cliente> findAll() {
		return pedidoRepository.findAll();
	}

	@Transactional
	public void addAll(Collection<Cliente> pedidos) {
		for (Cliente pedido : pedidos) {
			pedidoRepository.save(pedido);
		}
	}

	@Transactional
	public List<Cliente> findByName(String nome) {
		return pedidoRepository.findByName(nome);
	}
}
