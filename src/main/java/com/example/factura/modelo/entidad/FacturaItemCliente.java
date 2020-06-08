package com.example.factura.modelo.entidad;

public class FacturaItemCliente extends FacturaItem {
	private int id;
	private String codigo;
	private String descripcion;
	private int cantidad;
	private Double importe;
	private Double subtotal;
	
	public FacturaItemCliente(int id, String codigo, String descripcion, int cantidad, Double importe,
			Double subtotal) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.importe = importe;
		this.subtotal = subtotal;
	}
}
