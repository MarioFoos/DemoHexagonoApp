package com.diardon.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Dominio (Lógica de negocio)
@Entity
public class MyProduct
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ID autogenerado
	private Long id;
	private String name;
	private double price;

	public MyProduct(Long id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getId()
	{
		return id;
	}
	public void setName(String nombre)
	{
		this.name = nombre;
	}
	public String getName()
	{
		return name;
	}

	public void setPrice(double precio)
	{
		this.price = precio;
	}

	public double getPrice()
	{
		return price;
	}
}
