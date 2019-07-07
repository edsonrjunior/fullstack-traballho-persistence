package br.com.fiap.service;

import java.util.Collection;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.model.Estoque;
import br.com.fiap.model.Produto;
import br.com.fiap.repository.EstoqueRepository;

@Component
public class EstoqueService {
	@Autowired
	private EstoqueRepository estoqueRepository;


	@Transactional
	public List<Estoque> findAll() {
		return estoqueRepository.findAll();
	}

	public void add(Estoque estoque) {
		estoqueRepository.save(estoque);
	}
	
	@Transactional
	public void addAll(Collection<Estoque> estoques) {
		for (Estoque estoque : estoques) {
			estoqueRepository.save(estoque);
		}
	}

}
