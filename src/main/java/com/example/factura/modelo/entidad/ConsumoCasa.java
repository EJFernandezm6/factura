package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public class ConsumoCasa extends Consumo {
	private int cantidad;
	
	public ConsumoCasa(Timestamp periodoInicio, Timestamp periodoFin, Double precio, int cantidad) {
		super(periodoInicio, periodoFin, precio);
		this.cantidad = cantidad;
	}
	
	

	@Override
	public Double calculaImporteConsumo() {
		return precio * cantidad;
	}
	
}
