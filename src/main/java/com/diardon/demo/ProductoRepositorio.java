package com.diardon.demo;

import java.util.Optional;

public interface ProductoRepositorio
{
    Optional<Producto> findById(Long id);
    void save(Producto producto);
}
