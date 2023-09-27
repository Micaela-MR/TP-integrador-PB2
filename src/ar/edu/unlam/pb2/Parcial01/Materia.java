package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;
import java.util.Date;
import ar.edu.unlam.pb2.Parcial01.Carrera;

public class Materia {

	private Integer id;
	private String nombre;
	
	private ArrayList <Profesor>profesores;
	private ArrayList <Materia> correlativas;
	private Carrera carrera;
	private ArrayList <Comision> comisiones;
	private ArrayList <Evaluacion> notas;
	private EstadoDeLaMateria estadoMateria;
	
	
	
	
	public Materia(Integer id, String nombre, Carrera carrera) {
		
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
		this.profesores = new ArrayList<Profesor>();
		this.correlativas = new ArrayList<Materia>();
		this.comisiones = new ArrayList<Comision>();
		this.notas = new ArrayList<Evaluacion>();
	}



	public Boolean agregarComision(Comision comision){ //deMica
		Boolean comisionAgregada=false;
		if(this.comisiones.isEmpty()) {
			this.comisiones.add(comision);
			comisionAgregada = true;
		}else if(!this.buscarComisionPorId(comision.getId()) && !this.buscarComisionPorTurnoYCicloLectivo(comision)) {
			this.comisiones.add(comision);
			comisionAgregada=true;
		}
		return comisionAgregada;
	}
	
	public Boolean buscarComisionPorTurnoYCicloLectivo(Comision comision) {
		Boolean comisionEncontrada=false;
		for (int i = 0; i < this.comisiones.size(); i++) {
				if(this.comisiones.get(i).getCiclo().getId().equals(comision.getCiclo().getId()) &&
				   this.comisiones.get(i).getTurno().equals(comision.getTurno())) {
					comisionEncontrada=true;
				}
			}
		return comisionEncontrada;
	}
	
	public Boolean buscarComisionPorId(Integer idComision) {
		Boolean comisionEncontrada = false;
		for (int i = 0; i < comisiones.size(); i++) {
			if(this.comisiones.get(i).getId().equals(idComision)) {
				comisionEncontrada = true;
			}
		}
		return comisionEncontrada;
	}
	
<<<<<<< Updated upstream
	public Comision buscarYDevolverComisionPorId(Integer idComision) {
		Comision comisionEncontrada = null;
		for (int i = 0; i < comisiones.size(); i++) {
			if(this.comisiones.get(i).getId().equals(idComision)) {
				comisionEncontrada = comisiones.get(i);
=======
	public Comision buscarComisionPorIdQueDevuelvaComision(Integer idComision) {
		Comision comisionEncontrada = null;
		for (int i = 0; i < comisiones.size(); i++) {
			if(this.comisiones.get(i).getId().equals(idComision)) {
				comisionEncontrada = this.comisiones.get(i);
>>>>>>> Stashed changes
			}
		}
		return comisionEncontrada;
	}
	
	
	public Boolean agregarDocentes(Profesor docenteAgregar) {
        Boolean seAgrego = false;	
	
	    	if(!this.buscarDocentePorDni(docenteAgregar)){	
	    			profesores.add(docenteAgregar);
	    			seAgrego = true;
	    		}	    	
		   
			return seAgrego;
		
	}
	public Boolean buscarDocentePorDni(Profesor docente) {
		Boolean profeEncontradoPorDni = false;
		for (int i = 0; i < profesores.size(); i++) {
			if(this.profesores.get(i).getDni()== docente.getDni()) {
				profeEncontradoPorDni = true;
			}
		}
		return profeEncontradoPorDni;
	}
	public Boolean buscarDocentePorDniConNumero(Integer dniProfesor) {
		Boolean profeEncontradoPorDni = false;
		for (int i = 0; i < profesores.size(); i++) {
			if(this.profesores.get(i).getDni()== dniProfesor) {
				profeEncontradoPorDni = true;
			}
		}
		return profeEncontradoPorDni;
	}
	public Boolean agregarCorrelatividad(Integer idMateria, Integer idCorrelativa) {
		Boolean seAgregoCorrelativa = false;
	
        ArrayList <Materia> materiasCarrera = this.carrera.getMaterias();
        for (int i = 0; i < materiasCarrera.size(); i++) {
        	for (int j = 0; j <  materiasCarrera.size(); j++) {
			if(materiasCarrera.get(i).getId() == idMateria && materiasCarrera.get(j).getId() == idCorrelativa ) {
				Materia correlativaNueva = materiasCarrera.get(j);
				correlativas.add(correlativaNueva);
				 seAgregoCorrelativa = true;
			}
		}
        }
		return seAgregoCorrelativa;
	}
	public Boolean registrarNota (Integer idComision, Integer idAlumno, Evaluacion nota) {
		Boolean notaIngresada=false;
		if(!this.correlativasPromocionadas() && nota.getNota() >= 7) {
			notaIngresada=false;
		} else {
			for(int i = 0; i < comisiones.size(); i++) {
				Alumno alumno = this.comisiones.get(i).buscarAlumnoPorId(idAlumno);
				if(this.comisiones.get(i).getId().equals(idComision) && 
				   !alumno.noRendirDosRecuperatorios()) {
					alumno.agregarNota(nota);
					if(nota.getNota()>7 && nota.getNota()<10) {
							alumno.agregarMateriaAprobada(comisiones.get(i).getMateria());
					notaIngresada = true;
				}
			}
		  }
		}
		return notaIngresada;
	}
	
	public Boolean correlativasPromocionadas() {
		for(int i=0;i<correlativas.size();i++) {
			if(!correlativas.get(i).getEstadoMateria().equals(EstadoDeLaMateria.promocionada)) {
				return false;
			}
		}return true;
	}
	
	
	public Double obtenerNota(Integer idAlumno, Integer idMateria) {
		Double notaObtenida = 0.0;
		Alumno alumno = null;
		 alumno = this.carrera.buscarAlumnoPorIdQueDevuelveElAlumno(idAlumno);
		Materia materia = this.carrera.buscarMateriaPorIdQueDevuelveLaMateria(idMateria);
		
		for (int i = 0; i < alumno.getNotas().size(); i++) {		
			if( alumno.getNotas().get(i).getMateria().equals(materia)) {				
				notaObtenida = alumno.getNotas().get(i).getNota();	
	          
			}
		}
		return notaObtenida;
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



	public ArrayList<Profesor> getDocentes() {
		return profesores;
	}


	public void setDocentes(ArrayList<Profesor> docentes) {
		this.profesores = docentes;
	}



	public ArrayList<Materia> getCorrelativas() {
		return correlativas;
	}


	public void setCorrelativas(ArrayList<Materia> correlativas) {
		this.correlativas = correlativas;
	}


	public Carrera getCarrera() {
		return carrera;
	}


	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}



	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}



	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}



	public ArrayList<Comision> getComisiones() {
		return comisiones;
	}



	public void setComisiones(ArrayList<Comision> comisiones) {
		this.comisiones = comisiones;
	}



	public ArrayList<Evaluacion> getNotas() {
		return notas;
	}



	public void setNotas(ArrayList<Evaluacion> notas) {
		this.notas = notas;
	}



	public EstadoDeLaMateria getEstadoMateria() {
		return estadoMateria;
	}



	public void setEstadoMateria(EstadoDeLaMateria estadoMateria) {
		this.estadoMateria = estadoMateria;
	}
	
	
	
	
	
	
}
