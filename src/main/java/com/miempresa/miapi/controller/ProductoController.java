package com.miempresa.miapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.miempresa.miapi.model.Producto;
import com.miempresa.miapi.repository.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository repo;

    // 🔹 Listar
    @GetMapping
    public List<Producto> listar() {
        return repo.findAll();
    }

    // 🔹 Guardar
    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return repo.save(producto);
    }

    // 🔹 Eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}