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
public class MyProductController
{
	private final MyProductServicePort productServicePort;

	@Autowired
	public MyProductController(MyProductServicePort productoService)
	{
		this.productServicePort = productoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<MyProduct> getProduct(@PathVariable Long id)
	{
		return ResponseEntity.ok(productServicePort.getProductById(id));
	}

	@PostMapping
	public ResponseEntity<Void> saveProduct(@RequestBody MyProduct producto)
	{
		productServicePort.saveProduct(producto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
