package br.com.fiap.service;

import java.util.Collection;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Pedido;
import br.com.fiap.repository.ClienteRepository;
import br.com.fiap.repository.PedidoRepository;

@Component
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;

	public void add(Pedido pedido) {
		pedidoRepository.save(pedido);
	}

	@Transactional
	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	@Transactional
	public void addAll(Collection<Pedido> pedidos) {
		for (Pedido pedido : pedidos) {
			pedidoRepository.save(pedido);
		}
	}

}
