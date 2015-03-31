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
@Table(name="PERMISSION")
public class Permission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idpermiso")       		 private int    idpermiso;
	@Column(name = "idvehiculo")	  		 private int    idvehiculo;
	@Column(name = "numeropermiso")          private int    numeropermiso; 
	@Column(name = "empresa", length = 255)  private String empresa; 
	@Column(name = "fechaemision")       	 private String fechaemision;
	@Column(name = "fechavencimiento")       private String fechavencimiento;
	@Column(name = "estado", length = 100)   private String estado; 
	
	public Permission(){
	}
	
	public Permission(int idpermiso, int idvehiculo, int numeropermiso,
			String empresa, String fechaemision, String fechavencimiento,
			String estado, int puntos, String medida){
		super();
		this.idpermiso = idpermiso;
		this.idvehiculo = idvehiculo;
		this.numeropermiso = numeropermiso;
		this.empresa = empresa;
		this.fechaemision = fechaemision;
		this.fechavencimiento = fechavencimiento;
		this.estado = estado;
	}
	
	public int getIdpermiso() {
		return idpermiso;
	}
	public void setIdpermiso(int idpermiso) {
		this.idpermiso = idpermiso;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public int getNumeropermiso() {
		return numeropermiso;
	}
	public void setNumeropermiso(int numeropermiso) {
		this.numeropermiso = numeropermiso;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getFechaemision() {
		return fechaemision;
	}
	public void setFechaemision(String fechaemision) {
		this.fechaemision = fechaemision;
	}
	public String getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(String fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
