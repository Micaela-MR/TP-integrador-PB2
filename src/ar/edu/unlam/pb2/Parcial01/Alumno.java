package ar.edu.unlam.pb2.Parcial01;

<<<<<<< Updated upstream
import java.text.ParseException;
=======
>>>>>>> Stashed changes
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Alumno {

	private Integer id;
	private Integer dni;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Date fechaIngreso;
	private ArrayList <Comision> comisionesInscripto;
	private ArrayList <Materia> materiasAprobadas;
	private ArrayList <Materia>materiasPorAprobar;
	private ArrayList <Evaluacion> notas;
	private ArrayList<Materia>materiasAprobadas;
	private ArrayList <Materia>materiasPorAprobar;
	private ArrayList <Comision>comisionesInscripto;

	
<<<<<<< Updated upstream
	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-M-yyyy");
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido, String fechaDeNacimiento) throws ParseException {
=======
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido,String fechaDeNacimiento) {
>>>>>>> Stashed changes
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = formatoFecha.parse(fechaDeNacimiento);
		this.notas = new ArrayList<Evaluacion>();
		this.materiasAprobadas = new ArrayList<Materia>();
		this.materiasPorAprobar = new ArrayList<Materia>();
		this.comisionesInscripto = new ArrayList <Comision>();
	}

	public Alumno(Integer id, Integer dni, String nombre, String apellido,  String fechaDeNacimiento, String fechaIngreso) throws ParseException {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
<<<<<<< Updated upstream
		this.fechaDeNacimiento = formatoFecha.parse(fechaDeNacimiento);
		this.fechaIngreso = formatoFecha.parse(fechaIngreso);
		this.notas = new ArrayList<Evaluacion>();
=======
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaIngreso = fechaIngreso;
		this.notas = new ArrayList<Evaluacion>();
		this.materiasAprobadas = new ArrayList<Materia>();
		this.materiasPorAprobar = new ArrayList<Materia>();
		this.comisionesInscripto = new ArrayList <Comision>();
	}
	
	

	public Boolean noRendirDosRecuperatorios() {
		Boolean noRendir=false;
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec1Parcial) ||
			   notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec2Parcial)) {
			return noRendir= true;
		} else {
			return noRendir= false;
		}
		}
		return noRendir;
	}
	
	public void agregarMateriaAprobada(Materia materia){
		this.materiasAprobadas.add(materia);
		
	}
	
	public void agregarComisionesInscripto(Comision comision) {
		
		this.comisionesInscripto.add(comision);
	}
	
	
	public ArrayList<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public ArrayList<Materia> getMateriasPorAprobar() {
		return materiasPorAprobar;
	}

	public void setMateriasPorAprobar(ArrayList<Materia> materiasPorAprobar) {
		this.materiasPorAprobar = materiasPorAprobar;
>>>>>>> Stashed changes
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	public ArrayList<Evaluacion> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Evaluacion> notas) {
		this.notas = notas;
	}
	
<<<<<<< Updated upstream
	public ArrayList<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
=======
	
>>>>>>> Stashed changes

	public ArrayList<Comision> getComisionesInscripto() {
		return comisionesInscripto;
	}

<<<<<<< Updated upstream
	public ArrayList<Materia> getMateriasPorAprobar() {
		return materiasPorAprobar;
	}

	
	public Boolean agregarNota(Evaluacion nota) {
		if(nota.getNota()>1 && nota.getNota()<10 && !this.noRendirDosRecuperatorios()) {
			notas.add(nota);
		}
		return null;
	}
	
	public Boolean noRendirDosRecuperatorios() {
		Boolean noRendir=false;
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec1Parcial) ||
			   notas.get(i).getTipoDeNota().equals(TipoDeNota.Rec2Parcial)) {
			return noRendir= true;
		} else {
			return noRendir= false;
		}
		}
		return noRendir;
	}
	
	public Boolean cargarNotaFinal(Evaluacion nota) { //---------------------
		Boolean cargar=false;
		Boolean primerParcialAprobado=false;
		Boolean segundoParcialAprobado=false;
		
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i).getEstado().equals(EstadoExamen.aprobado) && notas.get(i).getTipoDeNota().equals(TipoDeNota.PrimerParc)){
				primerParcialAprobado = true;
			} else if (notas.get(i).getEstado().equals(EstadoExamen.aprobado) && notas.get(i).getTipoDeNota().equals(TipoDeNota.SegundoParc)) {
				segundoParcialAprobado=true;
			}
		}
		
		if(primerParcialAprobado && segundoParcialAprobado) {
			cargar=true;
		}
		return cargar;
	}
	
	public Integer getPromedio() { //--------------.
		Integer promedio = 0;
		for(int i=0;i<notas.size();i++) {
			promedio+=notas.get(i).getNota();
		}
		return (Integer)promedio/notas.size();
	}
}
=======
	public void setComisionesInscripto(ArrayList<Comision> comisionesInscripto) {
		this.comisionesInscripto = comisionesInscripto;
	}

	public void agregarNota(Evaluacion nota) {
		
		if(nota.getNota()>1 && nota.getNota()<10) {
			notas.add(nota);
		}
		
	}
	

}
>>>>>>> Stashed changes
