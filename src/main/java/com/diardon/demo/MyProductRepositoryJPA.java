package com.diardon.demo;

import java.util.Optional;

import org.springframework.stereotype.Repository;

// Adaptador de Persistencia (Base de datos con JPA)
@Repository
public class MyProductRepositoryJPA implements MyProductRepositoryPort
{
	private final MyProductJpaRepositoryPort jpaRepository;

	public MyProductRepositoryJPA(MyProductJpaRepositoryPort jpaRepository){
		this.jpaRepository = jpaRepository;
	}

	@Override
	public Optional<MyProduct> findById(Long id)
	{
		return jpaRepository.findById(id);
	}

	@Override
	public void save(MyProduct producto)
	{
		jpaRepository.save(producto);
	}
}

