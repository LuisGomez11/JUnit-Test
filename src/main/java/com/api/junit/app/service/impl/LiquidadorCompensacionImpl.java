package com.api.junit.app.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.api.junit.app.model.Empleado;
import com.api.junit.app.service.LiquidadorCompensacion;

@Service
public class LiquidadorCompensacionImpl implements LiquidadorCompensacion{

	@SuppressWarnings("deprecation")
	@Override
	public Double calcularCompensacion(Empleado empleado, Date fechaActual) {
		
		int añoIngreso = empleado.getFechaingreso().getYear();
		int añoActual = fechaActual.getYear();
		
		int rango = añoActual - añoIngreso;
		
		System.out.println("Rango: "+ rango);
		
		Double compensacion = 0.0;
		
		if(rango >= 3 && rango < 5) {
			compensacion = empleado.getSalario() * 0.30;
		} else if (rango >= 5 && empleado.getEdad() < 40) {
			compensacion = empleado.getSalario() * 0.50;
		} else if (rango >= 5 && empleado.getEdad() >= 40) {
			compensacion = empleado.getSalario() * 0.60;
		} else if (rango < 3) {
			compensacion = empleado.getSalario() * 0.15;
		}
		
		return compensacion;
	}

}
