package com.diardon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Implementación de Servicio (Caso de Uso)
@Service
public class MyProductServiceImpl implements MyProductServicePort
{
	private final MyProductRepositoryPort productoRepositorio;

	@Autowired
	public MyProductServiceImpl(MyProductRepositoryPort productoRepositorio)
	{
		this.productoRepositorio = productoRepositorio;
	}
	@Override
	public MyProduct getProductById(Long id)
	{
		return productoRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
	}
	@Override
	public void saveProduct(MyProduct producto)
	{
		productoRepositorio.save(producto);
	}
}
