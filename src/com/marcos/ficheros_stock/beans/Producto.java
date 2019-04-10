package com.marcos.ficheros_stock.beans;

public class Producto {

	private String id;
	private String nombre;
	private int cantidad;
	private float precio;
	
	
	public Producto() {
		
		this.id = "";
		this.nombre = "";
		this.cantidad = 0;
		this.precio = 0;		
	}
	
	
	public Producto(String id,
					String nombre,
					int cantidad,
					float precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "[" + id + "," + nombre + "," + cantidad + "," + precio + "]";
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
