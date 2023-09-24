package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private ArrayList <Comision>comision;
	private ArrayList <Profesor>docentes;
	
	
	public Materia(Integer id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.comision = new ArrayList <Comision>();
		this.docentes = new ArrayList<Profesor>();
	}

<<<<<<< Updated upstream
=======

	public void agregarComision(){
		
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
	
	
	
	public void eliminarCorrelatividad(Integer idMateria, Integer idCorrelativaAELiminar) {
		
	}
	
	public int registrarNota (Integer idComision, Integer idAlumno, Integer nota) {
		return 0;
	}


>>>>>>> Stashed changes
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


	public ArrayList<Comision> getComision() {
		return comision;
	}


	public void setComision(ArrayList<Comision> comision) {
		this.comision = comision;
	}


	public ArrayList<Profesor> getDocentes() {
		return docentes;
	}


	public void setDocentes(ArrayList<Profesor> docentes) {
		this.docentes = docentes;
	}


	

	public Boolean agregarComision(Comision comision){
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
	
	
	public Boolean agregarDocentes(Profesor docente) {
		if(!this.buscarDocentePorDni(docente.getDni())) {
    		docentes.add(docente);
    		return true;
    	}
    		return false;
	}
	
	public Boolean buscarDocentePorDni(Integer dniDocente) {
		Boolean docenteEncontrado = false;
		for(int i = 0; i < docentes.size(); i++) {
			if(this.docentes.get(i).getDni().equals(dniDocente)) {
				docenteEncontrado = true;
			}
		}
		return docenteEncontrado;
	}
	
	public Boolean asignarProfesorAlaComision(Integer idComision, Integer dniDocente) {
		Boolean seAsignoElProfesor=false;
		Profesor docenteAAgregar=null;
		
		for(int i = 0; i < docentes.size(); i++) {
			if(this.docentes.get(i).getDni().equals(dniDocente)) {
				docenteAAgregar = docentes.get(i);
			}
		}
		
		if(docenteAAgregar!=null) {
			for(int i = 0; i < comision.size(); i++) {
				if(this.comision.get(i).getId().equals(idComision)) {
					comision.get(i).asignarDocentesAComision(docenteAAgregar);
					seAsignoElProfesor = true;
				} else {
					seAsignoElProfesor = false;
				}
			}
		}return seAsignoElProfesor;
	}
	
	
	/*public void correlativaAgregada(Materia correlativa) {
		if(!correlativas.contains(correlativa)) {
			this.correlativas.add(correlativa);
		}
	}
	
	public void correlativaEliminada(Materia correlativa) {
		this.correlativas.remove(correlativa);
	}*/
	
	public int registrarNota (Integer idComision, Integer idAlumno, Integer nota) {
		return 0;
	}
}
