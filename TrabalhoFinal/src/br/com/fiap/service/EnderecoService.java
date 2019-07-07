package br.com.fiap.service;

import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.model.Endereco;
import br.com.fiap.repository.EnderecoRepository;

@Component
public class EnderecoService {
	@Autowired
	private EnderecoRepository enderecoRepository;

	public void add(Endereco endereco) {
		enderecoRepository.save(endereco);
	}

	@Transactional
	public List<Endereco> findAll() {
		return enderecoRepository.findAll();
	}

	@Transactional
	public void addAll(Collection<Endereco> enderecos) {
		for (Endereco endereco : enderecos) {
			enderecoRepository.save(endereco);
		}
	}

}
