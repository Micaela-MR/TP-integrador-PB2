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
	private ArrayList<Materia>materiasAprobadas;
	private ArrayList <Materia>materiasPorAprobar;
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido,String fechaDeNacimiento) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.notas = new ArrayList<Evaluacion>();
		this.materiasAprobadas = new ArrayList<Materia>();
		this.materiasPorAprobar = new ArrayList<Materia>();
	}

	public Alumno(Integer id, Integer dni, String nombre, String apellido,  String fechaDeNacimiento, String fechaIngreso) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.notas = new ArrayList<Evaluacion>();
		this.materiasAprobadas = new ArrayList<Materia>();
		this.materiasPorAprobar = new ArrayList<Materia>();
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
	
	public void agregarMateriaAprobada(Materia materia){
		this.materiasAprobadas.add(materia);
		
	}
	

	
	
	public ArrayList<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public ArrayList<Materia> getMateriasPorAprobar() {
		return materiasPorAprobar;
	}

	public void setMateriasPorAprobar(ArrayList<Materia> materiasPorAprobar) {
		this.materiasPorAprobar = materiasPorAprobar;
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

	public void agregarNota(Evaluacion nota) {
		
		if(nota.getNota()>1 && nota.getNota()<10) {
			notas.add(nota);
		}
		
	}
	

}
