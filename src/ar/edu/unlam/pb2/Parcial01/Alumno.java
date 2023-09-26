package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;
import java.util.Date;

public class Alumno {

	private Integer id;
	private Integer dni;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private String fechaIngreso;
	private ArrayList <Evaluacion> notas;
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido, String fechaDeNacimiento) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.notas = new ArrayList<Evaluacion>();
	}

	public Alumno(Integer id, Integer dni, String nombre, String apellido,  String fechaDeNacimiento, String fechaIngreso) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public ArrayList<Evaluacion> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Evaluacion> notas) {
		this.notas = notas;
	}


	public Boolean agregarNota(Evaluacion nota) {
		if(nota.getNota()>1 && nota.getNota()<10 && !this.noRendirDosRecuperatorios()) {
			notas.add(nota);
		}
		return null;
	}
	
	public Boolean noRendirDosRecuperatorios() {
		Boolean noRendir=false;
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec1Parcial) ||
			   notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec2Parcial)) {
			return noRendir= true;
		} else {
			return noRendir= false;
		}
		}
		return noRendir;
	}
	
	public Boolean cargarNotaFinal(Evaluacion nota) { //---------------------
		Boolean cargar=false;
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i).getEstado().equals(EstadoExamen.aprobado)||
			   notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec2Parcial)) {
			return cargar= true;
		} else {
			return cargar= false;
		}
		}
		return cargar;
	}
	
	public Integer getPromedio() { //--------------.
		Integer promedio = 0;
		for(int i=0;i<notas.size();i++) {
			promedio+=notas.get(i).getNota();
		}
		return (Integer)promedio/notas.size();
	}
	
}
