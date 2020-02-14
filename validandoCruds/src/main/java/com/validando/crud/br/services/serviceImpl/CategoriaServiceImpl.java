package com.validando.crud.br.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validando.crud.br.Repository.CategoriaRepository;
import com.validando.crud.br.domain.Categoria;
import com.validando.crud.br.services.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	@Override
	public List<Categoria> findAll() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria findById(Integer cod) {
		
		return categoriaRepository.findById(cod).get();//para não precisar o Optional coloca-se o .get() no final
	}

	@Override
	public Categoria save(Categoria categoria) {
	
		return categoriaRepository.save(categoria);
	}

}
