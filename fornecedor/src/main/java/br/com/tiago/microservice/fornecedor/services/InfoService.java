package br.com.tiago.microservice.fornecedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiago.microservice.fornecedor.model.InfoFornecedor;
import br.com.tiago.microservice.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
		
	}

}
