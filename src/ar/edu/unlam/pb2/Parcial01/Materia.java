package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Materia {

	private int id;
	private String nombre;
	private Comision comision;
	private ArrayList <Profesor>docentes;
	
	
	public Materia(int id, String nombre, Comision comision, ArrayList<Profesor> docentes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.comision = comision;
		this.docentes = docentes;
	}


	public void agregarComision(){
		
		}
	
	public void agregarDocentes() {
		
	}
	
	public void agregarCorrelatividad(int idMateria, int idCorrelativa) {
		
	}
	
	public void eliminarCorrelatividad(int idMateria, int idCorrelativaAELiminar) {
		
	}
	
	public int registrarNota (int idComision, int idAlumno, int nota) {
		return 0;
	}
}
