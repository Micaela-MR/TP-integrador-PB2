package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Comision {

	private Integer id;
	private String turno; //enum
	private CicloLectivo ciclo;
	private Aula aula;
	private ArrayList<Alumno> alumnosComision;
	private ArrayList<Profesor> profesores;
	
	
	public Comision(Integer id, String turno, CicloLectivo ciclo) {
		//super();
		this.id = id;
		this.turno = turno;
		this.ciclo = ciclo;
		this.alumnosComision = new ArrayList<Alumno>();
		this.profesores = new ArrayList<Profesor>();
	}
	
	public Integer getId() {
		return id;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	

	public CicloLectivo getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloLectivo ciclo) {
		this.ciclo = ciclo;
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

	

	
	public void inscribirAlumnoAComision (Integer dniAlumno, Integer idComision){
		
	}
	
	public void asignarProfesorAlaComision(Integer idComision, Integer dniDocente) {
		
	}
	
	public Integer asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		return 0;
	}
	
	
}
