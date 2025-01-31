package com.diardon.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface de repositorio para realizar las operaciones CRUD
public interface MyProductJpaRepositoryPort extends JpaRepository<MyProduct, Long>
{
    // Se pueden agregar métodos personalizados
}
