package com.diardon.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface de repositorio para realizar las operaciones CRUD
public interface ProductoJpaRepository extends JpaRepository<Producto, Long>
{
    // Se pueden agregar métodos personalizados
}
