package com.diardon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Implementación de Servicio (Caso de Uso)
@Service
public class ProductoServiceImpl implements ProductoService
{
	private final ProductoRepositorio productoRepositorio;

	@Autowired
	public ProductoServiceImpl(ProductoRepositorio productoRepositorio)
	{
		this.productoRepositorio = productoRepositorio;
	}
	@Override
	public Producto obtenerProductoPorId(Long id)
	{
		return productoRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
	}
	@Override
	public void guardarProducto(Producto producto)
	{
		productoRepositorio.save(producto);
	}
}
