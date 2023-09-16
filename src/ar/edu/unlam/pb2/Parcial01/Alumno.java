package ar.edu.unlam.pb2.Parcial01;

import java.util.Date;

public class Alumno {

	private int id;
	private int dni;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Date fechaIngreso;
	
	public Alumno(int id, int dni,  String nombre, String apellido, Date fechaDeNacimiento) {
		
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Alumno(int id,int dni, String nombre, String apellido,  Date fechaDeNacimiento, Date fechaIngreso) {
		
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaIngreso;
	}
}
