package com.validando.crud.br.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_Produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cod;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="preco")
	private Double preco;
	
	@Column(name="garantia")
	private Integer garantia;
	
	//@OneToMany
	private Categoria categoria;
	
	//@OneToMany
	private Marca marca;
	
	
	public Produto () {}


	public Produto(Integer cod, String nome, String descricao, Double preco, Integer garantia, Categoria categoria,
			Marca marca) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.garantia = garantia;
		this.categoria = categoria;
		this.marca = marca;
	}


	public Integer getCod() {
		return cod;
	}


	public void setCod(Integer cod) {
		this.cod = cod;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getGarantia() {
		return garantia;
	}


	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
