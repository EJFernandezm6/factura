package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public class ClientePlana extends Cliente {

	public ClientePlana(int id, String tipo, String cuidad) {
		super(id, tipo, cuidad);
	}

	@Override
	public Consumo creaConsumo(Timestamp periodoInicio, Timestamp periodoFin, Double precio, int horas, int cantidad) {
		return new ConsumoPlana(periodoInicio, periodoFin, precio);
	}

}
