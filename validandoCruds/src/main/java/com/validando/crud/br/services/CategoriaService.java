package com.validando.crud.br.services;

import java.util.List;

import com.validando.crud.br.domain.Categoria;

public interface CategoriaService {
	
	List<Categoria> findAll();
	Categoria findById(Integer cod);
	Categoria save(Categoria categoria);

}
