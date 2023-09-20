package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private ArrayList <CicloLectivo> ciclo;
	private ArrayList<Carrera> carreras;
	
	public Universidad(String nombre) {
		this.nombre = nombre;
		this.ciclo = new ArrayList<CicloLectivo>();
		this.carreras = new ArrayList<Carrera>();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<CicloLectivo> getCiclo() {
		return ciclo;
	}

	public void setCiclo(ArrayList<CicloLectivo> ciclo) {
		this.ciclo = ciclo;
	}

	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}



	
	public Boolean agregarCarrera(Carrera carrera) {
		if(!carreras.contains(carrera)) {
    		carreras.add(carrera);
    		return true;
    	} else {
    		return false;
    	}
	}
	
	public Boolean agregarCicloLectivo(CicloLectivo cicloLectivo) {  //------------------------
		if(!this.buscarCicloLectivoPorId(cicloLectivo)|| !this.seSuperponenLasFechas(cicloLectivo)) {
			this.ciclo.add(cicloLectivo);
			return true;
		}	
		return false;
	}
	
	public Boolean buscarCicloLectivoPorId(CicloLectivo cicloLectivo) {
		Boolean cicloLectivoEncontrado=false;
		for(int i=0;i<ciclo.size();i++) {
			if(this.ciclo.get(i).getId().equals(cicloLectivo.getId())) {
			   return cicloLectivoEncontrado=true;
			}
		}
		return cicloLectivoEncontrado;
		
	}
	
	public Boolean seSuperponenLasFechas(CicloLectivo cicloLectivo) { //-----------------
		if(cicloLectivo.getFechaInicioInscripcion().before(cicloLectivo.getFechaFinalizacionInscripcion()) &&
		   cicloLectivo.getFechaFinalizacionInscripcion().before(cicloLectivo.getFechaInicioCicloLectivo()) &&
		   cicloLectivo.getFechaInicioCicloLectivo().before(cicloLectivo.getFechaFinalizacionCicloLectivo())) {
			return false;
		} else {
			return true;
		}
	}
}
