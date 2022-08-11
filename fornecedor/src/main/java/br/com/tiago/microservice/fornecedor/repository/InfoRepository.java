package br.com.tiago.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tiago.microservice.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);
}
