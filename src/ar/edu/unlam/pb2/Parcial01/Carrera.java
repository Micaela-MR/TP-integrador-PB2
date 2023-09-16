package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Carrera {
	
	private int id;
	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList<Alumno> alumnos;
	
	public Carrera(int id, String nombre, ArrayList<Materia> materias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.materias = materias;
	}
	
     public void agregarMateria() {
		
	}
     public void agregarAlumno() {
 		
 	}
     
     public String obtenerMateriasAprobadasParaUnAlumno(int idAlumno) {
    	 return "nop";
     }
	
	public int obtenerNota(int idAlumno, int idMateria) {
		return 0;
		
	}
	public String obtenerMateriasQueFaltanCursarParaUnAlumno(int idAlumno) {
		return "nop";
	}
	public int calcularPromedio(int idAlumno) {
		return 0;
	}
}


