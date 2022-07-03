package com.guevara.empleos.service;

import java.util.List;

import com.guevara.empleos.model.Vacante;

public interface InterfaceVacantes {
	
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vacante);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	public long numeroVacantes();
	void modificar(Integer posicion, Vacante vac);
	int buscarPosicion(Vacante vac);

}
