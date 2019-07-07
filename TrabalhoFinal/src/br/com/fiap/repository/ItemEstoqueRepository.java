package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.ItemEstoque;

@Repository
public interface ItemEstoqueRepository extends JpaRepository<ItemEstoque, Long> {

}