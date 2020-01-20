package com.api.junit.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.junit.app.model.Empleado;
import com.api.junit.app.service.LiquidadorCompensacion;

@SpringBootTest
public class JunitTestApplicationTests {

	@Autowired
	LiquidadorCompensacion service;
	
	@Test
	public void contextLoads() throws Exception{
		
		Empleado emp = new Empleado();
		
		Double expectativa = 900.0;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		emp.setId(UUID.randomUUID().toString());
		emp.setNombre("Luis");
		emp.setApellido("Gomez");
		emp.setFechaingreso(formato.parse("18/01/2016"));
		emp.setEdad(30);
		emp.setSalario(3000.0);
		emp.setNdi("1234");
		
		Double compensacion = service.calcularCompensacion(emp, new Date());
		
		assertEquals(expectativa, compensacion);
		
	}

}
