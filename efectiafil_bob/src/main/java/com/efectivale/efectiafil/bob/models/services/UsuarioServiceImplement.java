package com.efectivale.efectiafil.bob.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.efectivale.efectiafil.bob.models.dao.IUsuarioDao;
import com.efectivale.efectiafil.bob.models.entity.usuario;

//Es un estereotipo de component para que sea un componente del framework
@Service
public class UsuarioServiceImplement implements IUsuarioService {

	// Anotacion para inyectar el UsuarioDao
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<usuario>) usuarioDao.findAll();
	}

}
