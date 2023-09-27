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
	
	
	public Comision(Integer id, CicloLectivo ciclo, String turno, ArrayList<Alumno> alumnosComision,
			ArrayList<Profesor> profesores, Materia materia) {
		super();
		this.id = id;
		this.ciclo = ciclo;
		this.turno = turno;
		this.alumnosComision = alumnosComision;
		this.profesores = profesores;
		this.materia = materia;
	}

	
	
	public void agregarCicloLectivo() {
		
	}
	
	public void agregarDocentesAComision(){
		
	}
	
	public void inscribirAlumnoAComision (Integer dni, Integer idComision){
		
	}
	
	public void asignarProfesorAlaComision(Integer idComision, Integer dniDocente) {
		
	}
	
	public int asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		return 0;
	}
	
	
}
