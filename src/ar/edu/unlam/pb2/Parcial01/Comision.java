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
