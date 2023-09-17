package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Carrera {
	
	private Integer id;
	private String nombre;
	private ArrayList<Materia> materias;
	//private ArrayList<Alumno> alumnos;
	
	public Carrera(Integer id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.materias = new ArrayList<Materia>();
	}
	
    public void agregarMateria() {
		
	}
     
    public void agregarAlumno() {
 		
 	}
     
    public String obtenerMateriasAprobadasParaUnAlumno(Integer idAlumno) {
    	return "nop";
    }
	
	public Integer obtenerNota(Integer idAlumno, Integer idMateria) {
		return 0;
	} // ?
	
	public String obtenerMateriasQueFaltanCursarParaUnAlumno(Integer idAlumno) {
		return "nop";
	}
	
	public Double calcularPromedio(Integer idAlumno) {
		return 0.0;
	}
}