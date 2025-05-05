package com.mx.productos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.productos.dto.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer> {

}
