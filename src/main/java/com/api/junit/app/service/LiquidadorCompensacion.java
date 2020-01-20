package com.api.junit.app.service;

import java.util.Date;

import com.api.junit.app.model.Empleado;

public interface LiquidadorCompensacion {

	public Double calcularCompensacion(Empleado empleado,Date fechaActual);
	
}
