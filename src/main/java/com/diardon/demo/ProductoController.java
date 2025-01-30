package com.diardon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Adaptador de Entrada (Controlador REST)
@RestController
@RequestMapping("/productos")
public class ProductoController
{
	private final ProductoService productoService;

	@Autowired
	public ProductoController(ProductoService productoService)
	{
		this.productoService = productoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id)
	{
		return ResponseEntity.ok(productoService.obtenerProductoPorId(id));
	}

	@PostMapping
	public ResponseEntity<Void> guardarProducto(@RequestBody Producto producto)
	{
		productoService.guardarProducto(producto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
