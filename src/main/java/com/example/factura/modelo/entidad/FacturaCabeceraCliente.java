package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public class FacturaCabeceraCliente extends FacturaCabecera {
	private String numeroSerie;
	private Timestamp periodoInicio;
	private Timestamp periodoFin;
	private int idCliente;
	private Timestamp fechaEmision;
	
	
	public FacturaCabeceraCliente() {
		super();
	}


	public FacturaCabeceraCliente(String numeroSerie, Timestamp periodoInicio, Timestamp periodoFin, int idCliente,
			Timestamp fechaEmision) {
		super();
		this.numeroSerie = numeroSerie;
		this.periodoInicio = periodoInicio;
		this.periodoFin = periodoFin;
		this.idCliente = idCliente;
		this.fechaEmision = fechaEmision;
	}
}
