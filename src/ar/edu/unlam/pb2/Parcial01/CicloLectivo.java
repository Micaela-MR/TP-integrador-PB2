package ar.edu.unlam.pb2.Parcial01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CicloLectivo {

	private Integer id;
	private Date fechaInicioCicloLectivo;
	private Date fechaFinalizacionCicloLectivo;
	private Date fechaInicioInscripcion;
	private Date fechaFinalizacionInscripcion;
	
	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-M-yyyy");
	
	public CicloLectivo(Integer id, String fechaInicioInscripcion, String fechaFinalizacionInscripcion,String fechaInicioCicloLectivo, String fechaFinalizacionCicloLectivo) throws ParseException {
		this.id = id;
		this.fechaInicioInscripcion = formatoFecha.parse(fechaInicioInscripcion);
		this.fechaFinalizacionInscripcion = formatoFecha.parse(fechaFinalizacionInscripcion);
		this.fechaInicioCicloLectivo =  formatoFecha.parse(fechaInicioCicloLectivo);
		this.fechaFinalizacionCicloLectivo = formatoFecha.parse(fechaFinalizacionCicloLectivo);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaInicioCicloLectivo() {
		return fechaInicioCicloLectivo;
	}

	public void setFechaInicioCicloLectivo(Date fechaInicioCicloLectivo) {
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
	}

	public Date getFechaFinalizacionCicloLectivo() {
		return fechaFinalizacionCicloLectivo;
	}

	public void setFechaFinalizacionCicloLectivo(Date fechaFinalizacionCicloLectivo) {
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
	}

	public Date getFechaInicioInscripcion() {
		return fechaInicioInscripcion;
	}

	public void setFechaInicioInscripcion(Date fechaInicioInscripcion) {
		this.fechaInicioInscripcion = fechaInicioInscripcion;
	}

	public Date getFechaFinalizacionInscripcion() {
		return fechaFinalizacionInscripcion;
	}

	public void setFechaFinalizacionInscripcion(Date fechaFinalizacionInscripcion) {
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}
	
	
}
