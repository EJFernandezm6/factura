package com.example.factura.modelo.entidad;

import java.util.ArrayList;

public class FacturaCliente extends Factura {
	public FacturaCliente() {
		cabecera = new FacturaCabeceraCliente();
		items = new ArrayList<FacturaItemCliente>();
	}
}
