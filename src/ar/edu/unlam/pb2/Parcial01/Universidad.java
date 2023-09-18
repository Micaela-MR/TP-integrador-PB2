package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private ArrayList<Carrera> carreras;
	
	public Universidad(String nombre) {
		this.nombre = nombre;
		this.carreras = new ArrayList<Carrera>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}

	public void agregarCarrera(Carrera ingenieria) {
		this.carreras.add(ingenieria);
		
	}	

	
}
