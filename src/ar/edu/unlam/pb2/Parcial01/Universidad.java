package ar.edu.unlam.pb2.Parcial01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Universidad {
	
	private String nombre;
	private ArrayList<CicloLectivo> ciclo;
	private ArrayList<Carrera> carreras;
	
	public Universidad(String nombre) {
		this.nombre = nombre;
		this.ciclo = new ArrayList<CicloLectivo>();
		this.carreras = new ArrayList<Carrera>();
	}
	
	public Boolean agregarCicloLectivo(CicloLectivo ciclo1) {
		Boolean seAgrego = false;
	   
	    	if(!buscarCicloLectivoPorId(ciclo1.getId())) {
	    		if(!seSuperponenLasFechas(ciclo1.getFechaInicioCicloLectivo(), ciclo1.getFechaFinalizacionCicloLectivo())) {
	    			ciclo.add(ciclo1);
	    			seAgrego = true;
	    		}
	    	}else {
	    		seAgrego = false;
	    	}
		
		
			
			return seAgrego;
		}
	public boolean buscarCicloLectivoPorId(Integer idCiclo) {
		Boolean cicloEncontradoPorId = false;
		for (int i = 0; i < ciclo.size(); i++) {
			if(this.ciclo.get(i).getId()== idCiclo) {
				cicloEncontradoPorId = true;
			}
		}
		return cicloEncontradoPorId;
	}
	public Date formatoDeStringADate(String fecha) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		Date fechaFormateada = formato.parse(fecha);
		return fechaFormateada;
	}
	
	public Boolean seSuperponenLasFechas(Date fecha1, Date fecha2) {
		
		if(fecha1.before(fecha2)) {
			return false;
		}else {
			return true;
		}
	}
	

	public Date establecerFechas(int dia, int mes, int year) {
		Calendar calendar = new GregorianCalendar();
		calendar.set(year, mes, dia);
		Date fecha = calendar.getTime();
		return fecha;
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

	public ArrayList<CicloLectivo> getCiclo() {
		return ciclo;
	}

	public void setCiclo(ArrayList<CicloLectivo> ciclo) {
		this.ciclo = ciclo;
	}
	

    
}
