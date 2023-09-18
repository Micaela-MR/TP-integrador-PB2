package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Comision {

	private Integer id;
	private CicloLectivo ciclo;
	private String turno;
	private ArrayList<Alumno> alumnosComision;
	private ArrayList<Profesor> profesores;
	private Aula aula;
	
	
	public Comision(Integer id, CicloLectivo ciclo, String turno) {
		super();
		this.id = id;
		this.ciclo = ciclo;
		this.turno = turno;
		this.alumnosComision = new ArrayList<Alumno>();
		this.profesores = new ArrayList<Profesor>();
		this.aula = asignarAulaAlaComision(0,0);
		
	}

	
	
	public void agregarCicloLectivo() {
		
	}
	
	public void agregarDocentesAComision(){
		
	}
	
	public void inscribirAlumnoAComision (Integer dni, Integer idComision){
		
	}
	
	public void asignarProfesorAlaComision(Integer idComision, Integer dniDocente) {
		
	}
	
	public Aula asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		return null;
	}
	
	
}
