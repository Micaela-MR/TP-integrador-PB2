package ar.edu.unlam.pb2.Parcial01;

import java.util.Date;

public class CicloLectivo {

	private int id;
	private Date fechaInicioCicloLectivo;
	private Date fechaFinalizacionCicloLectivo;
	private Date fechaInicioInscripcion;
	private Date fechaFinalizacionInscripcion;
	
	public CicloLectivo(int id, Date fechaInicioCicloLectivo, Date fechaFinalizacionCicloLectivo,
			Date fechaInicioInscripcion, Date fechaFinalizacionInscripcion) {
		
		this.id = id;
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}
	
	
}
