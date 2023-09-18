package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private Comision comision;
	private ArrayList <Profesor>docentes;
	
	
	public Materia(Integer id, String nombre, Comision comision) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.comision = comision;
		this.docentes = new ArrayList<Profesor>();
	}


	public void agregarComision(){
		
		}
	
	public void agregarDocentes() {
		
	}
	
	public void agregarCorrelatividad(Integer idMateria, Integer idCorrelativa) {
		
	}
	
	public void eliminarCorrelatividad(Integer idMateria, Integer idCorrelativaAELiminar) {
		
	}
	
	public int registrarNota (Integer idComision, Integer idAlumno, Integer nota) {
		return 0;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Comision getComision() {
		return comision;
	}


	public void setComision(Comision comision) {
		this.comision = comision;
	}


	public ArrayList<Profesor> getDocentes() {
		return docentes;
	}


	public void setDocentes(ArrayList<Profesor> docentes) {
		this.docentes = docentes;
	}
	
}
