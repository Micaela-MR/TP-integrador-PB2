package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Carrera {
	
	private Integer id;
	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList<Alumno> alumnos;
	
	public Carrera(Integer id, String nombre, ArrayList<Materia> materias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.materias = materias;
	}
	
     public void agregarMateria() {
		
	}
     public void agregarAlumno() {
 		
 	}
     
     public String obtenerMateriasAprobadasParaUnAlumno(Integer idAlumno) {
    	 return "nop";
     }
	
	public int obtenerNota(Integer idAlumno, Integer idMateria) {
		return 0;
		
	}
	public String obtenerMateriasQueFaltanCursarParaUnAlumno(Integer idAlumno) {
		return "nop";
	}
	public int calcularPromedio(Integer idAlumno) {
		return 0;
	}
}


