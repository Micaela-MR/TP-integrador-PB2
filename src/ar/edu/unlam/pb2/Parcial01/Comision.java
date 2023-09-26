package ar.edu.unlam.pb2.Parcial01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


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
		Alumno nuevoAlumno = carrera.buscarAlumnoPordniQueDevuelveElAlumno(dni);
		Comision comision = this.materia.buscarComisionPorIdQueDevuelvaComision(idComision);
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();
        String formattedDate = formato.format(fechaActual);
        for (int j = 0; j < nuevoAlumno.getComisionesInscripto().size(); j++) {	
		if (this.carrera.buscarAlumnoPorDni(dni)) {
			if(nuevoAlumno.getComisionesInscripto().get(j).getId().equals(idComision)) {
				if(!this.materia.correlativasPromocionadas()) {
					if(ciclo.getFechaInicioInscripcion().after(fechaActual) && ciclo.getFechaFinalizacionInscripcion().before(fechaActual) ) {
						if(this.aula.getCantidadDeAlumnos()<this.aula.getCANTIDAD_MAXIMA_DE_ALUMNOS()) {
							if(!nuevoAlumno.getComisionesInscripto().get(j).getTurno().equals(comision.getTurno())) {
								if(!nuevoAlumno.getMateriasAprobadas().contains(comision.getMateria())) {
									alumnosComision.add(nuevoAlumno);
									 seAgrego = true;
								}
							}
						}
					}		
			}
		 }
		}
			
		}
		return seAgrego;
 

	}
	

	
	
	public Boolean asignarDocentesAComision(Profesor docenteAAgregar) { //de Mica
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
		if(profesores.size() < (int)alumnosComision.size()/20) {
			return asignarNuevoDocente=true;
		}return asignarNuevoDocente;
	}
	
	
	public Aula asignarAulaAlaComision(Integer idComision, Integer dniDocente) {
		 Aula nueva = null;
		if(this.materia.buscarComisionPorId(idComision)) {
			if(this.materia.buscarDocentePorDniConNumero(dniDocente)) {
			   nueva = new Aula(01, 20);
				
			}
			
		}
		return nueva;
		
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

     
	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
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
	
	

	
	
}
