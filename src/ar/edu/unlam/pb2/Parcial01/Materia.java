package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private ArrayList <Comision>comisiones;
	private ArrayList <Profesor>docentes;
	private EstadoDeLaMateria estadoMateria;
	
	public Materia(Integer id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.comisiones = new ArrayList<Comision>();
		this.docentes = new ArrayList<Profesor>();
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


	public ArrayList<Comision> getComision() {
		return comisiones;
	}


	public void setComision(ArrayList<Comision> comision) {
		this.comisiones = comision;
	}


	public ArrayList<Profesor> getDocentes() {
		return docentes;
	}


	public void setDocentes(ArrayList<Profesor> docentes) {
		this.docentes = docentes;
	}

	
	

	public ArrayList<Comision> getComisiones() {
		return comisiones;
	}

	public void setComisiones(ArrayList<Comision> comisiones) {
		this.comisiones = comisiones;
	}


	public Boolean agregarComision(Comision comision){
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
	
	
	public Boolean agregarDocentes(Profesor docenteAgregar) {
		 Boolean seAgrego = false;	
			
	    	if(docentes.isEmpty() || !this.buscarDocentePorDni(docenteAgregar)){	
	    			docentes.add(docenteAgregar);
	    			seAgrego = true;
	    		}	    	
		   
			return seAgrego;
		
	}
	
	public Boolean buscarDocentePorDni(Profesor docente) {
		Boolean profeEncontradoPorDni = false;
		for (int i = 0; i < docentes.size(); i++) {
			if(this.docentes.get(i).getDni().equals(docente.getDni())) {
				profeEncontradoPorDni = true;
			}
		}
		return profeEncontradoPorDni;
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
			for(int i = 0; i < comisiones.size(); i++) {
				if(this.comisiones.get(i).getId().equals(idComision)) {
					seAsignoElProfesor = comisiones.get(i).asignarDocentesAComision(docenteAAgregar);
				}
			}
		}return seAsignoElProfesor;
	}
	
	public Boolean registrarNota (Integer idComision, Integer idAlumno, Evaluacion nota) {
		Boolean notaIngresada=false;
		for(int i = 0; i < comisiones.size(); i++) {
			if(this.comisiones.get(i).getId().equals(idComision)) {
				comisiones.get(i).buscarAlumnoPorId(idAlumno).agregarNota(nota);
			}
		}
		return notaIngresada;
	}
	
	public void correlativasAprobadas() {
		
	}
	
	public Alumno buscarAlumnoEnComision(Integer idAlumno) {
		Alumno alumnoEncontrado=null;
		return alumnoEncontrado;
	}
}
