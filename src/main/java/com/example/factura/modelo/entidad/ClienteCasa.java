package com.example.factura.modelo.entidad;

import java.sql.Timestamp;

public class ClienteCasa extends Cliente {

	public ClienteCasa(int id, String tipo, String cuidad) {
		super(id, tipo, cuidad);
	}

	@Override
	public Consumo creaConsumo(Timestamp periodoInicio, Timestamp periodoFin, Double precio, int cantidad, int horas) {
		return new ConsumoCasa(periodoInicio, periodoFin, precio, cantidad);
	}

}
