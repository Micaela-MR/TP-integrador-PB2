package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Comision {

	private Integer id;
	
	private String turno;
	private ArrayList<Alumno> alumnosComision;
	private ArrayList<Profesor> profesores;
	
	private Aula aula;
	
	
	public Comision(Integer id, String turno) {
		super();
		this.id = id;
		
		this.turno = turno;
		this.alumnosComision = new ArrayList<Alumno>();
		this.profesores = new ArrayList<Profesor>();
		this.aula = asignarAulaAlaComision(0,0);
		
	}

	
	
	
	public void inscribirAlumnoAComision (Integer dni, Integer idComision){
		
	}
	
	public void asignarDocentesAlaComision(Integer idComision, Integer dniDocente) {
		
	}
	
	public Aula asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		return null;
	}


	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}





	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
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



	public Aula getAula() {
		return aula;
	}



	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	
}
