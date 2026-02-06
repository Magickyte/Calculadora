package com.fing.app.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc {
	
	
	//"calc/{oper}/{n1}/{n2}"
	@GetMapping("/calc/{oper}/{n1}/{n2}")
	public String calc(@PathVariable String oper, @PathVariable int n1,@PathVariable int n2) {
		if(oper.equals("suma")) {
			return "La suma de " +n1 +"+"+n2+"="+(n1+n2);
		}else if(oper.equals("resta")) {
			return "La resta de " +n1 +"-"+n2+"="+(n1-n2);
		}else if(oper.equals("multi")){
			return "La multiplicacion de " +n1 +"*"+n2+"="+(n1*n2);
		}else if(oper.equals("division")){
			if(n2 == 0) {
				return "No se puede divir entre 0";
			}else {
				return "La division de " +n1 +"/"+n2+"="+((double)n1/n2);
			}
		}else {
			return "Operacion invalida";
	}
	}
	
	@RequestMapping("/")
	public String root() {
		
		return "Hola";
	}
	
}
