package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
@RestController
@RequestMapping("/api")
public class PersonaController {
	
	@GetMapping("/saludar")
	public String saludar() {
		return "Hola";
	}
	
	@GetMapping("/GetPersona/{id}")
	public ResponseEntity<?> Getpersona(@PathVariable Long id) {
		try {			
			if (id == 1) {
				Persona p = new Persona();
				p.setNombre("Juan");
				p.setApellido("Bandera");
				p.setDireccion("calle 8");
				p.setEdad(29);
				return new ResponseEntity<Persona>(p,HttpStatus.OK);	
			}
			else {
				return new ResponseEntity<String>("El id es null",HttpStatus.CONFLICT);
			}
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}		
	}
	
	@GetMapping("/GetPersonas")
	public ResponseEntity<List<Persona>> Getpersonas() {
		List<Persona> prs = new ArrayList<>();
		Persona p = new Persona();
		p.setNombre("Juan");
		p.setApellido("Bandera");
		p.setDireccion("calle 8");
		p.setEdad(29);
		
		prs.add(p);
		
		return new ResponseEntity<List<Persona>>(prs,HttpStatus.OK);
	}
	@PostMapping("/Addpersona")
	public ResponseEntity<?> Addpersona(@RequestBody @Validated Persona p) {
		
		
		return new ResponseEntity<Persona>(p,HttpStatus.OK);
	}
}
