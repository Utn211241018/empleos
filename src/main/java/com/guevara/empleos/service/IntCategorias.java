package com.guevara.empleos.service;

import java.util.List;

import com.guevara.empleos.model.Categoria;

public interface IntCategorias {
	 
	//Metodos abstractos
	public List<Categoria> obtenerTodas();
	public void agregar (Categoria categoria);
	public Categoria buscarPorId (Integer idCategoria);
	public void eliminar (Integer idCategoria);
	public int totalCategorias();
	public void modificar(Integer posicion, Categoria categoria);
	public int buscarPosicion(Categoria categoria);
}
