package com.mx.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.productos.dao.ProductoDao;
import com.mx.productos.dto.Producto;

@Service
public class ProductoImplementacion implements LibreriaProducto  {

	@Autowired
	ProductoDao productoDao;

	@Transactional(readOnly = true)
	@Override
	public List<Producto> ListarProductos() {
		// TODO Auto-generated method stub
		return productoDao.findAll();
	}

	@Override
	public void guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		productoDao.save(producto);
		
	}
	
	
	
	
	
}
