package com.mx.productos.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODCUTOS")
public class Producto {

@Id
@Column(name="IDENTIDFICADOR", columnDefinition = "Number", nullable = false)
 int id;
@Column(name="NOMBRE_P", columnDefinition = "NVarchar(20)", nullable = false)
String nombre;
@Column(name="FECHA_C", columnDefinition = "DATE", nullable = false)
Date caducidad;
@Column(name="MARCA", columnDefinition = "NVARCHAR(20)", nullable = false)
String marca;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Date getCaducidad() {
	return caducidad;
}
public void setCaducidad(Date caducidad) {
	this.caducidad = caducidad;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}

public Producto() {
}

public Producto(int id, String nombre, Date caducidad, String marca) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.caducidad = caducidad;
	this.marca = marca;
}
}
