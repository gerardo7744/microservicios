package com.efectivale.efectiafil.bob.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuario_efectiafil")

public class usuario implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_user;
	
	@Column(name="activo", nullable=false)
	private Boolean activo;
	private Long afiliado;
	private Long estacion;
	private String email;
	private String password;
	
	@Column(name="fechacreacion")
	//indicamos el tipo equivalente en base de datos
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@Column(name="fechaModificacion")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Long getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Long afiliado) {
		this.afiliado = afiliado;
	}

	public Long getEstacion() {
		return estacion;
	}

	public void setEstacion(Long estacion) {
		this.estacion = estacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechacreacion) {
		this.fechaCreacion = fechacreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechamodificacion) {
		this.fechaModificacion = fechamodificacion;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}