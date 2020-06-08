package com.example.factura.modelo.entidad;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private int id;
	private String tipo;
	private String cuidad;
	List<Consumo> consumos = new ArrayList<Consumo>();
	
	public Cliente(int id, String tipo, String cuidad) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cuidad = cuidad;
	}

	public abstract Consumo creaConsumo(Timestamp periodoInicio, Timestamp periodoFin, Double precio, int horas, int cantidad);
	
	public void nuevoConsumo(Timestamp periodoInicio, Timestamp periodoFin, Double precio, int horas, int cantidad) {
		Consumo consumo = this.creaConsumo(periodoInicio, periodoFin, precio, horas, cantidad);
		this.consumos.add(consumo);
	}
}
