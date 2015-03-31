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
@Table(name="TRAFFICTICKET")
public class TrafficTicket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idpapeleta")     private int    idpapeleta;
	@Column(name = "idvehiculo")     private int    idvehiculo;
	@Column(name = "numeropapeleta") private int    numeropapeleta; 
	@Column(name = "fecha")          private String fecha; 
	@Column(name = "idinfraccion")   private int    idinfraccion;
	
	public TrafficTicket(){
	}
	
	public TrafficTicket(int idpapeleta, int idvehiculo, int numeropapeleta,
			String fecha, int idinfraccion){
		super();
		this.idinfraccion = idinfraccion;
		this.idvehiculo = idvehiculo;
		this.numeropapeleta = numeropapeleta;
		this.fecha = fecha;
		this.idinfraccion = idinfraccion;
	}
	
	public int getIdpapeleta() {
		return idpapeleta;
	}
	public void setIdpapeleta(int idpapeleta) {
		this.idpapeleta = idpapeleta;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public int getNumeropapeleta() {
		return numeropapeleta;
	}
	public void setNumeropapeleta(int numeropapeleta) {
		this.numeropapeleta = numeropapeleta;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getIdinfraccion() {
		return idinfraccion;
	}
	public void setIdinfraccion(int idinfraccion) {
		this.idinfraccion = idinfraccion;
	}
	
	
}
