package com.validando.crud.br.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.validando.crud.br.domain.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {

}
