package ar.edu.unlam.pb2.Parcial01;

import java.util.Date;

public class Alumno {

	private Integer id;
	private Integer dni;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private String fechaIngreso;
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido,String fechaDeNacimiento) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Alumno(Integer id, Integer dni, String nombre, String apellido,  String fechaDeNacimiento, String fechaIngreso) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaIngreso;
	}
}
