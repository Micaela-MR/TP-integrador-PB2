package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private String direccion;
	private ArrayList<Carrera> carreras;
	
	public Universidad(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.carreras = new ArrayList<Carrera>();
	}	

	public Boolean agregarCarrera(Carrera carrera) {
		if(!carreras.contains(carrera)) {
    		carreras.add(carrera);
    		return true;
    	} else {
    		return false;
    	}
	}
	
}
