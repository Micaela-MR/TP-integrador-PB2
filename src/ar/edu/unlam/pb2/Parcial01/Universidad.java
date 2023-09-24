package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private ArrayList<CicloLectivo> ciclo;
	private ArrayList<Carrera> carreras;
	private ArrayList<Aula> aulas;
	
	public Universidad(String nombre) {
		this.nombre = nombre;
		this.ciclo = new ArrayList<CicloLectivo>();
		this.carreras = new ArrayList<Carrera>();
		this.aulas = new ArrayList<Aula>();
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
	
/**	public Boolean agregarCicloLectivo(CicloLectivo ciclo1) {
		Boolean seAgrego = false;
		
		for (int i = 0; i < ciclo.size(); i++) {
			Date fechaInicioCiclo1 = ciclo1.getFechaInicioCicloLectivo();
			Date fechaFinCiclo1 = ciclo1.getFechaFinalizacionCicloLectivo();
			Date fechaInicioCicloi = this.ciclo.get(i).getFechaInicioCicloLectivo();
			Date fechaFinCicloi = this.ciclo.get(i).getFechaFinalizacionCicloLectivo();
	    	if(!this.buscarCicloLectivoPorId(ciclo1.getId()) && !this.seSuperponenLasFechas(fechaInicioCiclo1, fechaInicioCicloi, fechaFinCiclo1,fechaFinCicloi)){	
	    			ciclo.add(ciclo1);
	    			seAgrego = true;
	    		}	    	
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
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		Date fechaFormateada = formato.parse(fecha);
		return fechaFormateada;
	}
	
	public Boolean seSuperponenLasFechas(Date fechaInicio1, Date fechaInicio2, Date fechaFin1, Date fechaFin2) {
		Boolean seSuperponen = false;
		if(fechaInicio1.before(fechaFin2) && fechaInicio1.equals(fechaFin2)) {
			if(fechaFin1.after(fechaInicio2) && fechaFin1.equals(fechaInicio2)){
			return true;
		}else {
			return false;
		}	
	    }
		return seSuperponen;
	}
	

	public Date establecerFechas(int dia, int mes, int year) {
		
		Calendar calendar = new GregorianCalendar();
		calendar.set(year, mes, dia);
		Date fecha = calendar.getTime();
		
		return fecha;
	}**/
	
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
	

    
	public Boolean agregarCicloLectivo(CicloLectivo cicloLectivo) {  //------------------------
		if(!this.buscarCicloLectivoPorId(cicloLectivo) && !this.seSuperponenLasFechasDeUnCiclo(cicloLectivo) && !this.seSuperponenLasFechasDeDosCiclos(cicloLectivo)) {
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
	
	public Boolean seSuperponenLasFechasDeUnCiclo(CicloLectivo cicloLectivo) { //-----------------
		if(cicloLectivo.getFechaInicioInscripcion().before(cicloLectivo.getFechaFinalizacionInscripcion()) &&
		   cicloLectivo.getFechaFinalizacionInscripcion().before(cicloLectivo.getFechaInicioCicloLectivo()) &&
		   cicloLectivo.getFechaInicioCicloLectivo().before(cicloLectivo.getFechaFinalizacionCicloLectivo())) {
			return false;
		} else {
			return true;
		}
	}
	
	public Boolean seSuperponenLasFechasDeDosCiclos(CicloLectivo cicloLectivo) { //-----------------
		Boolean seSuperponen=false; 
		for(int i=0;i<ciclo.size();i++) {
			if(ciclo.get(i).getFechaFinalizacionCicloLectivo().after(cicloLectivo.getFechaInicioInscripcion())) {
			seSuperponen = true;
		} 
		}
		return seSuperponen;
	}

}
