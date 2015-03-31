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
@Table(name="INFRACTION")
public class Infraction{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idinfraccion") 			 private int    idinfraccion;
	@Column(name = "codigo", length = 10)	 private String codigo;
	@Column(name = "descripcion")  		  	 private String descripcion; 
	@Column(name = "gravedad", length = 100) private String gravedad; 
	@Column(name = "monto")        			 private double monto;
	@Column(name = "descuento")    			 private double descuento;
	@Column(name = "sancion", length = 255)  private String sancion; 
	@Column(name = "puntos")       			 private int    puntos;
	@Column(name = "medida")                 private String medida;
	
	public Infraction(){
	}
	
	public Infraction(int idinfraccion, String codigo, String descripcion,
			String gravedad, double monto, double descuento, String sancion,
			int puntos, String medida){
		super();
		this.idinfraccion = idinfraccion;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.gravedad = gravedad;
		this.monto = monto;
		this.descuento = descuento;
		this.sancion = sancion;
		this.puntos = puntos;
		this.medida = medida;
	}

	public int getIdInfraccion() {
		return idinfraccion;
	}

	public void setIdInfraccion(int idinfraccion) {
		this.idinfraccion = idinfraccion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGravedad() {
		return gravedad;
	}

	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getSancion() {
		return sancion;
	}

	public void setSancion(String sancion) {
		this.sancion = sancion;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}
	
}
