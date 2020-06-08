package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public class ConsumoPlana extends Consumo {

	public ConsumoPlana(Timestamp periodoInicio, Timestamp periodoFin, Double precio) {
		super(periodoInicio, periodoFin, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculaImporteConsumo() {
		return precio;
	}

}
