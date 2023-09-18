package ar.edu.unlam.pb2.Parcial01;

import java.util.Date;

public class CicloLectivo {

	private Integer id;
	private String fechaInicioCicloLectivo;
	private String fechaFinalizacionCicloLectivo;
	private String fechaInicioInscripcion;
	private String fechaFinalizacionInscripcion;
	
	public CicloLectivo(Integer id, String fechaInicioCicloLectivo, String fechaFinalizacionCicloLectivo,
			String fechaInicioInscripcion, String fechaFinalizacionInscripcion) {
		this.id = id;
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFechaInicioCicloLectivo() {
		return fechaInicioCicloLectivo;
	}

	public void setFechaInicioCicloLectivo(String fechaInicioCicloLectivo) {
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
	}

	public String getFechaFinalizacionCicloLectivo() {
		return fechaFinalizacionCicloLectivo;
	}

	public void setFechaFinalizacionCicloLectivo(String fechaFinalizacionCicloLectivo) {
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
	}

	public String getFechaInicioInscripcion() {
		return fechaInicioInscripcion;
	}

	public void setFechaInicioInscripcion(String fechaInicioInscripcion) {
		this.fechaInicioInscripcion = fechaInicioInscripcion;
	}

	public String getFechaFinalizacionInscripcion() {
		return fechaFinalizacionInscripcion;
	}

	public void setFechaFinalizacionInscripcion(String fechaFinalizacionInscripcion) {
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}
	
	
}
