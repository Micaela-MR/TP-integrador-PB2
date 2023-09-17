package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Comision {

	private Integer id;
	private CicloLectivo ciclo;
	private String turno;
	private ArrayList<Alumno> alumnosComision;
	private ArrayList<Profesor> profesores;
	private Materia materia;
	private Aula aula;
	
	
	public Comision(Integer id, CicloLectivo ciclo, String turno, Materia materia) {
		//super();
		this.id = id;
		this.ciclo = ciclo;
		this.turno = turno;
		this.alumnosComision = new ArrayList<Alumno>();
		this.profesores = new ArrayList<Profesor>();
		this.materia = materia;
	}
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public ArrayList<Alumno> getAlumnosComision() {
		return alumnosComision;
	}



	public void setAlumnosComision(ArrayList<Alumno> alumnosComision) {
		this.alumnosComision = alumnosComision;
	}



	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}



	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}



	public Materia getMateria() {
		return materia;
	}



	public void setMateria(Materia materia) {
		this.materia = materia;
	}



	public Aula getAula() {
		return aula;
	}



	public void setAula(Aula aula) {
		this.aula = aula;
	}


	
	

	public void agregarCicloLectivo() {
		
	}
	
	public void inscribirAlumnoAComision (Integer dniAlumno, Integer idComision){
		
	}
	
	public void asignarProfesorAlaComision(Integer idComision, Integer dniDocente) {
		
	}
	
	public Integer asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		return 0;
	}
	
	
}
