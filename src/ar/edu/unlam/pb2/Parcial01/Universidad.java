package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private ArrayList<Carrera> carreras;
	
	public Universidad(String nombre, ArrayList<Carrera> carreras) {
		this.nombre = nombre;
		this.carreras = carreras;
	}	

}
