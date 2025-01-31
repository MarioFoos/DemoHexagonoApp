package com.diardon.demo;

// Puerto de Entrada (Definición del caso de uso)
public interface MyProductServicePort
{
	MyProduct getProductById(Long id);

	void saveProduct(MyProduct product);
}
