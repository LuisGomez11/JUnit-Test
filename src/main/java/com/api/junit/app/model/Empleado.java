package com.api.junit.app.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

	private String id;
	private Date fechaingreso;
	private String nombre;
	private String apellido;
	private String ndi;
	private Double salario;
	private Integer edad;

}
