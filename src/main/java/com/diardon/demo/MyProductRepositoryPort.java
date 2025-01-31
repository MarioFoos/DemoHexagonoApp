package com.diardon.demo;

import java.util.Optional;

// Puerto de Salida (Repositorio)
public interface MyProductRepositoryPort
{
    Optional<MyProduct> findById(Long id);
    void save(MyProduct producto);
}
