package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public class ConsumoOficina extends Consumo {
	private int horas;
	private int cantidad;

	public ConsumoOficina(Timestamp periodoInicio, Timestamp periodoFin, Double precio, int cantidad, int horas) {
		super(periodoInicio, periodoFin, precio);
		this.horas = horas;
		this.cantidad = cantidad;
	}

	@Override
	public Double calculaImporteConsumo() {
		return precio * cantidad * horas;
	}

}
