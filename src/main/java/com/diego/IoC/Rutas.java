package com.diego.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diego.IoC.interfaces.Iva;

@Controller
public class Rutas {
	
	@Autowired
	Iva espana;
	
	@Autowired
	Iva francia;
	
	@GetMapping("/precio/francia/{cantidad}")
	@ResponseBody 
	public double rutaFrancia(@PathVariable int cantidad) {
		
		
		return cantidad + cantidad * francia.getIva() ;
		
	}
	
	
	@GetMapping("/precio/espana/{cantidad}")
	@ResponseBody 
	public double rutaEspana(@PathVariable int cantidad) {
	
		
		return cantidad + cantidad * espana.getIva();
		
	}
	
	

}
