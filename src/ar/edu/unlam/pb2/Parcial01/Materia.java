package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private ArrayList <Comision>comision;
	private ArrayList <Profesor>docentes;
	
	
	public Materia(Integer id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.comision = new ArrayList <Comision>();
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
	} //?
}
