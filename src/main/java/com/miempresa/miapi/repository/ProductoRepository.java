package com.miempresa.miapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.miapi.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}