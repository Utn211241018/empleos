package com.guevara.empleos.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guevara.empleos.model.Categoria;
import com.guevara.empleos.model.Vacante;
@Service
public class VacantesServiceImp implements InterfaceVacantes{

	//atributo
	private List<Vacante> lista = null;
	
	//Método Constructor
		public VacantesServiceImp() {
			lista = new LinkedList<Vacante>();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//Una instancia
			
			try {
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("Desarrollo Web");
			v1.setDescripcion("Aplicaciones php");
			v1.setFecha(LocalDate.parse("07/06/2022", formato));
			v1.setSalario(304.70);
			v1.setEstatus("Creada");
			v1.setDestacado(1);
			v1.setImagen("logo8.png");
			v1.setDetalles("<h2>Ofrecemos</h2>"
					+ "<ul><li>Salario atractivo</li>"
					+ "<li>Oportunidad de desarrollo</li></ul>");
			Categoria cat1 = new Categoria();
			cat1.setId(4);
			cat1.setNombre("Programación");
			cat1.setDescripcion("");
			v1.setCategoria(cat1);
			//********************************************************
			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("Ingeniero en Telecomunicaciones");
			v2.setDescripcion("Conocimiento en redes");
			v2.setFecha(LocalDate.parse("16/11/2022", formato));
			v2.setSalario(500.50);
			v2.setEstatus("Creada");
			v2.setDestacado(1);
			v2.setImagen("logo8.png");
			v2.setDetalles("<h2>Ofrecemos</h2>"
					+ "<ul><li>Salario atractivo</li>"
					+ "<li>Oportunidad de desarrollo</li></ul>");
			Categoria cat2 = new Categoria();
			cat2.setId(2);
			cat2.setNombre("Tecnologías");
			cat2.setDescripcion("Descripción");
			v2.setCategoria(cat2);
			//***********************************************************
			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("Contador Público");
			v3.setDescripcion("Conocimiento en ACCESS");
			v3.setFecha(LocalDate.parse("24/04/2022", formato));
			v3.setSalario(708.90);
			v3.setEstatus("Creada");
			v3.setDestacado(1);
			v3.setImagen("logo8.png");
			v3.setDetalles("<h2>Ofrecemos</h2>"
					+ "<ul><li>Salario atractivo</li>"
					+ "<li>Oportunidad de desarrollo</li></ul>");
			Categoria cat3 = new Categoria();
			cat3.setId(5);
			cat3.setNombre("Contabilidad");
			cat3.setDescripcion("....");
			v3.setCategoria(cat3);
			
			lista.add(v1);
			lista.add(v2);
			lista.add(v3);
			}catch(DateTimeParseException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		}

	@Override
	public List<Vacante> obtenerTodas() {
		return lista;
	}

	@Override
	public void guardar(Vacante vacante) {
		lista.add(vacante);
	}

	@Override
	public void eliminar(Integer idVacante) {
		lista.remove(buscarPorId(idVacante));
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		for(Vacante v : lista) {
			if(v.getId()==idVacante) {
				return v;
			}
		} return null;
	}

	@Override
	public long numeroVacantes() {
		return lista.size();
	}
	
	@Override
	public void modificar(Integer posicion, Vacante vac) {
		lista.set(posicion, vac);
	}
	
	@Override
	public int buscarPosicion(Vacante vac) {
		int index = 0; Vacante aux = null;
		int posicion = -1;
		while(index < lista.size()) {
			aux = lista.get(index);
			if(aux.getId()==vac.getId()) {
				posicion= index;
				break;
		} index++;
		
	} return posicion;
}
	


}
