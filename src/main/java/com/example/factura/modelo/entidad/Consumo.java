package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public abstract class Consumo {
	protected Timestamp periodoInicio;
	protected Timestamp periodoFin;
	protected Double precio;
	
	public Consumo(Timestamp periodoInicio, Timestamp periodoFin, Double precio) {
		this.periodoInicio = periodoInicio;
		this.periodoFin = periodoFin;
		this.precio = precio;
	}
	
	public abstract Double calculaImporteConsumo();
	

}
