package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Carrera {
	
	private Integer id;
	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList<Alumno> alumnos;
	
	public Carrera(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.materias = new ArrayList<Materia>();
		this.alumnos = new ArrayList<Alumno>();
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

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
}


