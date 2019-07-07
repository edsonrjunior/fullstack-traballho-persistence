package br.com.fiap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.model.Estoque;
import br.com.fiap.repository.EstoqueRepository;

@Component
public class EstoqueService {
	@Autowired
	private EstoqueRepository estoqueRepository;

	public void add(Estoque estoque) {
		estoqueRepository.save(estoque);
	}

	@Transactional
	public List<Estoque> findAll() {
		return estoqueRepository.findAll();
	}

}
