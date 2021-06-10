package com.efectivale.efectiafil.bob.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.efectivale.efectiafil.bob.models.entity.usuario;

//long es el tipo de dato de la llave primaria
public interface IUsuarioDao extends CrudRepository<usuario,Long> {

}
