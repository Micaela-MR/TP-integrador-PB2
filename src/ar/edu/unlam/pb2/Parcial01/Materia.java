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
	private ArrayList <Comision> comision;
	
	
	
	
	public Materia(Integer id, String nombre, Carrera carrera) {
		
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
		this.profesores = new ArrayList<Profesor>();
		this.correlativas = new ArrayList<Materia>();
		this.comision = new ArrayList<Comision>();
	}



	public Boolean agregarComision(Comision comision){ //deMica
		Boolean comisionAgregada=false;
		if(this.comision.isEmpty()) {
			this.comision.add(comision);
			comisionAgregada = true;
		}else if(!this.buscarComisionPorId(comision.getId()) && !this.buscarComisionPorTurnoYCicloLectivo(comision)) {
			this.comision.add(comision);
			comisionAgregada=true;
		}
		return comisionAgregada;
	}
	
	public Boolean buscarComisionPorTurnoYCicloLectivo(Comision comision) {
		Boolean comisionEncontrada=false;
		for (int i = 0; i < this.comision.size(); i++) {
				if(this.comision.get(i).getCiclo().getId().equals(comision.getCiclo().getId()) &&
				   this.comision.get(i).getTurno().equals(comision.getTurno())) {
					comisionEncontrada=true;
				}
			}
		return comisionEncontrada;
	}
	
	public Boolean buscarComisionPorId(Integer idComision) {
		Boolean comisionEncontrada = false;
		for (int i = 0; i < comision.size(); i++) {
			if(this.comision.get(i).getId().equals(idComision)) {
				comisionEncontrada = true;
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
	
	public Integer obtenerNota(Integer idAlumno, Integer idMateria) {
		Alumno alumno = this.carrera.buscarAlumnoPorIdQueDevuelveElAlumno(idAlumno);
		
		
		return 0;
	}
	public void eliminarCorrelatividad1(Integer idMateria, Integer idCorrelativaAELiminar) {
		
	}
	
	public int registrarNota1 (Integer idComision, Integer idAlumno, Integer nota) {
		return 0;
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
	
}
