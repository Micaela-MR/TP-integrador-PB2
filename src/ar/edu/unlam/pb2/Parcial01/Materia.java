package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private ArrayList <Materia> correlativas;
	private ArrayList <Comision>comision;
	private ArrayList <Profesor>docentes;
	
	
	public Materia(Integer id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.correlativas = new ArrayList<Materia>();
		this.comision = new ArrayList <Comision>();
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

	public ArrayList<Materia> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(ArrayList<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	
	
	
	

	public Boolean agregarComision(Comision comision){ //------------------------------
		Boolean comisionAgregada = false;
		if(!this.buscarComisionPorId(comision.getId())) {
			for (int i = 0; i < this.comision.size(); i++) {
				if(!this.comision.get(i).getCiclo().getId().equals(comision.getCiclo().getId()) && !this.comision.get(i).getTurno().equals(comision.getTurno())) {
					this.comision.add(comision);
					comisionAgregada = true;
				}
			}
		}
		return comisionAgregada;
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
	
	public void correlativaAgregada(Materia correlativa) {
		if(!correlativas.contains(correlativa)) {
			this.correlativas.add(correlativa);
		}
	}
	
	public void correlativaEliminada(Materia correlativa) {
		this.correlativas.remove(correlativa);
	}
	
	public int registrarNota (Integer idComision, Integer idAlumno, Integer nota) {
		return 0;
	}
}
