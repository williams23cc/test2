package com.pe.puridiom.dm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author PuridiomPe
 * @version 1.0
 * 
 *
 */
@Entity
@Table(name="OWNER")
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idpropietario")          private int    idpropietario;
	@Column(name = "idvehiculo")             private int    idvehiculo;
	@Column(name = "nombre", length = 100)   private String nombre; 
	@Column(name = "apellido", length = 100) private String apellido;
	
	public Owner(){
		
	}
	
	public Owner(int idpropietario, int idvehiculo, String nombre, String apellido){
		super();
		this.idpropietario = idpropietario;
		this.idvehiculo = idvehiculo;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getIdpropietario() {
		return idpropietario;
	}
	public void setIdpropietario(int idpropietario) {
		this.idpropietario = idpropietario;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	} 
	
	

}
