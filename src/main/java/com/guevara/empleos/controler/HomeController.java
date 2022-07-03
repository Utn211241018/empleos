package com.guevara.empleos.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guevara.empleos.model.Categoria;
import com.guevara.empleos.model.Vacante;
import com.guevara.empleos.service.IntCategorias;
import com.guevara.empleos.service.InterfaceVacantes;

@RequestMapping("/")
@Controller
public class HomeController {
	
	@Autowired
	private InterfaceVacantes serviceVacantes;
	
	@Autowired
	private IntCategorias serviceCategorias;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Vacante> lista = serviceVacantes.obtenerTodas();
		List<Categoria> categorias = serviceCategorias.obtenerTodas();
		model.addAttribute("vacantes", lista);
		model.addAttribute("categorias", categorias);
		
		return "home";
	}

}
