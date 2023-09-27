package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Comision {

	private Integer id;
	private String turno;
	private CicloLectivo ciclo;
	private Aula aula;
	private ArrayList<Alumno> alumnosComision;
	private ArrayList<Profesor> profesores;

	/*private Carrera carrera;
	private Materia materia;*/
	
	
	
	public Comision(Integer id, String turno,/* Carrera carrera, Materia materia,*/ CicloLectivo ciclo) {
		//super();
		this.id = id;
		this.turno = turno;
		this.ciclo = ciclo;
		//this.materia = materia;
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

	

	
	public void inscribirAlumnoAComision (Alumno alumno){
		this.alumnosComision.add(alumno);
	}
	
	public Alumno buscarAlumnoPorId (Integer idAlumno) {
		Alumno alumnoEncontrado=null;
		for(int i=0;i<alumnosComision.size();i++) {
			if(alumnosComision.get(i).getId().equals(idAlumno)) {
				alumnoEncontrado=alumnosComision.get(i);
			}
		}
		return alumnoEncontrado;
	}
	
	public Boolean asignarDocentesAComision(Profesor docenteAAgregar) {
		Boolean agregarProfesor=false;
		
		if(profesores.isEmpty()) {
			profesores.add(docenteAAgregar);
			return agregarProfesor = true;
		} else if (!profesores.contains(docenteAAgregar) && this.asignarDocenteCadaVeinteAlumnos()) {
			profesores.add(docenteAAgregar);
			return agregarProfesor = true;
		}
		return agregarProfesor;
	}
	
	public Boolean asignarDocenteCadaVeinteAlumnos() { //arreglar
		Boolean asignarNuevoDocente=false;
		if(profesores.size() < (int)(alumnosComision.size()/20)) {
			return asignarNuevoDocente=true;
		}return asignarNuevoDocente;
	}
	
	public void asignarAulaAlaComision(Aula aula) {
		this.aula = aula;
	}
}