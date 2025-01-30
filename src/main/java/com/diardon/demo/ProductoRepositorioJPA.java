package com.diardon.demo;

import java.util.Optional;

import org.springframework.stereotype.Repository;

// Adaptador de Persistencia (Base de datos con JPA)
@Repository
public class ProductoRepositorioJPA implements ProductoRepositorio
{
	private final ProductoJpaRepository jpaRepository;

	public ProductoRepositorioJPA(ProductoJpaRepository jpaRepository){
		this.jpaRepository = jpaRepository;
	}

	@Override
	public Optional<Producto> findById(Long id)
	{
		return jpaRepository.findById(id);
	}

	@Override
	public void save(Producto producto)
	{
		jpaRepository.save(producto);
	}
}
