package com.diardon.demo;

// Puerto de Entrada (Definición del caso de uso)
public interface ProductoService
{
	Producto obtenerProductoPorId(Long id);

	void guardarProducto(Producto producto);
}
