package br.com.fiap.main;

import java.util.Arrays;

import javax.swing.JOptionPane;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Estoque;
import br.com.fiap.model.ItemEstoque;
import br.com.fiap.model.ItemPedido;
import br.com.fiap.model.Pedido;
import br.com.fiap.model.Produto;
import br.com.fiap.service.ClienteService;
import br.com.fiap.service.EstoqueService;
import br.com.fiap.service.ProdutoService;

public class SpringJPATeste {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/spring.xml");

		ClienteService clienteService = ctx.getBean(ClienteService.class);
		ProdutoService produtoService = ctx.getBean(ProdutoService.class);
		EstoqueService estoqueService = ctx.getBean(EstoqueService.class);

		// Criando os clientes.
		Cliente cliente1 = new Cliente(1, "Edson Raimundo Jr", "999.999.999-99", "94834-1617", "Rua Jaguaré, 999", 333,
				05347010, "São Paulo", "SP");
		Cliente cliente2 = new Cliente(2, "Mariana Silva", "888.999.999-99", "94834-8788", "Rua Quinze, 444", 335,
				87888654, "Osasco", "SP");
		Cliente cliente3 = new Cliente(3, "Katia Antes", "888.999.777-99", "94838-7627", "Rua Onze, 444", 735, 89888654,
				"Rio de Janeiro", "RJ");

		// Criando os produtos
		Produto produto1 = new Produto(1, "TV", 1000, 2500.00);
		Produto produto2 = new Produto(2, "Geladeira", 500, 2800.00);
		Produto produto3 = new Produto(3, "Microondas", 500, 400.00);
		Produto produto4 = new Produto(4, "Notebook", 250, 3500.00);

		// Salvando os produtos no banco
		produtoService.addAll(Arrays.asList(produto1, produto2, produto3, produto4));

		// Criando os items do estoque
		ItemEstoque item1 = new ItemEstoque(produto1, 100);
		ItemEstoque item2 = new ItemEstoque(produto2, 150);
		ItemEstoque item3 = new ItemEstoque(produto3, 160);
		ItemEstoque item4 = new ItemEstoque(produto4, 1000);

		// Criando os pedidos
		Pedido pedido1 = new Pedido(1, cliente1);
		Pedido pedido2 = new Pedido(2, cliente2);
		Pedido pedido3 = new Pedido(3, cliente3);

		// Criando os itens do pedido
		ItemPedido itemPedido1 = new ItemPedido(pedido1, produto1, 1);
		ItemPedido itemPedido2 = new ItemPedido(pedido2, produto2, 1);
		ItemPedido itemPedido3 = new ItemPedido(pedido3, produto3, 1);

		// Salvando os itens do pedido no banco
		pedido1.getItens().addAll(Arrays.asList(itemPedido1, itemPedido2));

		ItemEstoque itemEstoque1 = new ItemEstoque(produto1, produto1.getQuantidade());
		ItemEstoque itemEstoque2 = new ItemEstoque(produto2, produto2.getQuantidade());
		ItemEstoque itemEstoque3 = new ItemEstoque(produto3, produto2.getQuantidade());
		ItemEstoque itemEstoque4 = new ItemEstoque(produto4, produto4.getQuantidade());

		Estoque estoque = new Estoque();

		//Adicionado os item do estoque e salvando no banco.
		estoque.getItens().addAll(Arrays.asList(itemEstoque1, itemEstoque2, itemEstoque3, itemEstoque4));
		estoqueService.add(estoque);

		
		
		// Criando os itens do estoque - Produto e a quantidade

		// Criando o Estoque e adicionando os itens.

//		produtoService
//				.addAll(Arrays.asList(new Produto(3, "Pera"), new Produto(4, "Morango"), new Produto(5, "Maracuja")));
//		System.out.println(produtoService.findAll());

//		System.out.println(produtoService.findByName("Maracuja"));
		ctx.close();

		JOptionPane.showMessageDialog(null, "Banco ok");
	}
}
