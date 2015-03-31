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
@Table(name="VEHICLE")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idvehiculo") 		  private int    idvehiculo;
	@Column(name = "placa", length = 20)  private String placa;
	@Column(name = "clase", length = 30)  private String clase; 
	@Column(name = "marca", length = 30)  private String marca; 
	@Column(name = "modelo", length = 30) private String modelo;
	@Column(name = "color", length = 20)  private String color;
	
	public Vehicle(){
	}
	
	public Vehicle(int idvehiculo, String placa, String clase,
			String marca, String modelo, String color){
		super();
		this.idvehiculo = idvehiculo;
		this.placa = placa;
		this.clase = clase;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
