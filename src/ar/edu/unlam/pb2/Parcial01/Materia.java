package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;
import java.util.Date;
import ar.edu.unlam.pb2.Parcial01.Carrera;

public class Materia {

	private Integer id;
	private String nombre;
	private Comision comision;
	private ArrayList <Profesor>docentes;
	private ArrayList <Materia> correlativas;
	private Carrera carrera;
	private ArrayList <Comision> comisiones;
	
	
	
	public Materia(Integer id, String nombre, Carrera carrera, Comision comision) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
		this.comision = comision;
		this.docentes = new ArrayList<Profesor>();
		this.correlativas = new ArrayList<Materia>();
		this.comisiones = new ArrayList<Comision>();
	}



	public Boolean agregarComision(Comision comision){ 
		Boolean comisionAgregada = false;
		if(!this.buscarComisionPorId(comision.getId())) {
			for (int i = 0; i < this.comisiones.size(); i++) {
				if(!this.comisiones.get(i).getCiclo().getId().equals(comision.getCiclo().getId()) && !this.comisiones.get(i).getTurno().equals(comision.getTurno())) {
					this.comisiones.add(comision);
					comisionAgregada = true;
				}
			}
		}
		return comisionAgregada;
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
	
	
	public Boolean agregarDocentes(Profesor docenteAgregar) {
        Boolean seAgrego = false;	
	
	    	if(!this.buscarDocentePorDni(docenteAgregar)){	
	    			docentes.add(docenteAgregar);
	    			seAgrego = true;
	    		}	    	
		   
			return seAgrego;
		
	}
	public Boolean buscarDocentePorDni(Profesor docente) {
		Boolean profeEncontradoPorDni = false;
		for (int i = 0; i < docentes.size(); i++) {
			if(this.docentes.get(i).getDni()== docente.getDni()) {
				profeEncontradoPorDni = true;
			}
		}
		return profeEncontradoPorDni;
	}
	
	
	public Boolean agregarCorrelatividad(Integer idMateria, Integer idCorrelativa) {
		Boolean seAgregoCorrelativa = false;
		Carrera carreraDeOrigen = getCarrera();
        ArrayList <Materia> materiasCarrera = carreraDeOrigen.getMaterias();
        for (int i = 0; i < materiasCarrera.size(); i++) {
			if(materiasCarrera.get(i).getId() == idMateria && materiasCarrera.get(i).getId() == idCorrelativa ) {
				Materia correlativaNueva = materiasCarrera.get(i);
				correlativas.add(correlativaNueva);
				 seAgregoCorrelativa = true;
			}
		}
		return seAgregoCorrelativa;
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


	public Comision getComision() {
		return comision;
	}


	public void setComision(Comision comision) {
		this.comision = comision;
	}


	public ArrayList<Profesor> getDocentes() {
		return docentes;
	}


	public void setDocentes(ArrayList<Profesor> docentes) {
		this.docentes = docentes;
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
