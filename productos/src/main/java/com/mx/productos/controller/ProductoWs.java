package com.mx.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.productos.dto.Producto;
import com.mx.productos.servicio.ProductoImplementacion;

@RestController
@RequestMapping("Producto")
@CrossOrigin
public class ProductoWs {
	
	@Autowired
	ProductoImplementacion procutoImplementacion;
	// http://localhost:9000/Productos
	
	@GetMapping("MostrarProducto")
	public List<Producto>listaproductos(){
		return procutoImplementacion.ListarProductos();

	}
}
