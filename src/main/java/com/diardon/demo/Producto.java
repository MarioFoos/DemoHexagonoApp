package com.diardon.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Dominio (Lógica de negocio)
@Entity
public class Producto
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ID autogenerado
	private Long id;
	private String nombre;
	private double precio;

	public Producto(Long id, String nombre, double precio)
	{
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getId()
	{
		return id;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return nombre;
	}

	public void setPrecio(double precio)
	{
		this.precio = precio;
	}

	public double getPrecio()
	{
		return precio;
	}
}
