package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Comision {

	private Integer id;
	
	private String turno;
	private ArrayList<Alumno> alumnosComision;
	private ArrayList<Profesor> profesores;
	private Carrera carrera;
	private Materia materia;
	private CicloLectivo ciclo;
	private Aula aula;
	
	
	public Comision(Integer id, String turno, Carrera carrera, Materia materia, CicloLectivo ciclo) {
		super();

		this.id = id;
		this.ciclo = ciclo;
		this.turno = turno;
		this.alumnosComision = new ArrayList<Alumno>();
		this.profesores = new ArrayList<Profesor>();

		this.materia = materia;
		this.aula = asignarAulaAlaComision(0,0);
		
	}

	
	public Boolean inscribirAlumnoAComision (Integer dni, Integer idComision){
		Boolean seAgrego = false;
		Alumno nuevoalumno = this.carrera.buscarAlumnoPordniQueDevuelveElAlumno(dni);
		if (this.carrera.buscarAlumnoPorDni(dni)) {
			if(this.materia.buscarComisionPorId(idComision)) {
				
				alumnosComision.add(nuevoalumno);
				 seAgrego = true;
			}
		}
		return seAgrego;
 

	}
	
	public void asignarDocentesAlaComision(Integer idComision, Integer dniDocente) {
		
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



	public Aula getAula() {
		return aula;
	}



	public void setAula(Aula aula) {
		this.aula = aula;
	}




	
	

	public void agregarCicloLectivo() {
		
	}
	
	
	
	public void asignarProfesorAlaComision(Integer idComision, Integer dniDocente) {
		
	}
	
	public Aula asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		return null;
	}
	public Carrera getCarrera() {
		return carrera;
	}


	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}


	public CicloLectivo getCiclo() {
		return ciclo;
	}


	public void setCiclo(CicloLectivo ciclo) {
		this.ciclo = ciclo;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}
	

	
	
}
