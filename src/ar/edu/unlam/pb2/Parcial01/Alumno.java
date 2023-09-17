package ar.edu.unlam.pb2.Parcial01;

import java.util.Date;

public class Alumno {

	private Integer id;
	private Integer dni;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Date fechaIngreso;
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido, Date fechaDeNacimiento) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Alumno(Integer id, Integer dni, String nombre, String apellido,  Date fechaDeNacimiento, Date fechaIngreso) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaIngreso;
	}
}
