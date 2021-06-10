package com.efectivale.efectiafil.bob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efectivale.efectiafil.bob.models.entity.usuario;
import com.efectivale.efectiafil.bob.models.services.IUsuarioService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<usuario> index() {
		return usuarioService.findAll();
	}
	

}
