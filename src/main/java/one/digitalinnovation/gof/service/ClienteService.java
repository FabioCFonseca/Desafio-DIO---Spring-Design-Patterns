package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

//Padrão Strategy - Interface abstraida permite que uma certa ação seja disparada dependendo da estratégia 

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
