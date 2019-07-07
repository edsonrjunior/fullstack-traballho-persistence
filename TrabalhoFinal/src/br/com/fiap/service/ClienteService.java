package br.com.fiap.service;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteRepository;

@Component
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public void add(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Transactional
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Transactional
	public void addAll(Collection<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			clienteRepository.save(cliente);
		}
	}

	@Transactional
	public List<Cliente> findByName(String nome) {
		return clienteRepository.findByName(nome);
	}
}
