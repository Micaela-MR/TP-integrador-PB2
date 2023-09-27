package ar.edu.unlam.pb2.Parcial01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	private ArrayList <Evaluacion> notas;
	
	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-M-yyyy");
	
	public Alumno(Integer id, Integer dni,  String nombre, String apellido, String fechaDeNacimiento) throws ParseException {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = formatoFecha.parse(fechaDeNacimiento);
		this.notas = new ArrayList<Evaluacion>();
	}

	public Alumno(Integer id, Integer dni, String nombre, String apellido,  String fechaDeNacimiento, String fechaIngreso) throws ParseException {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = formatoFecha.parse(fechaDeNacimiento);
		this.fechaIngreso = formatoFecha.parse(fechaIngreso);
		this.notas = new ArrayList<Evaluacion>();
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
	
	public ArrayList<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public ArrayList<Comision> getComisionesInscripto() {
		return comisionesInscripto;
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
		for(int i=0;i<notas.size();i++) {
			if((notas.get(i).getEstado().equals(EstadoExamen.aprobado) && notas.get(i).getTipoDeNota().equals(TipoDeNota.PrimerParc)) &&
			  (notas.get(i).getEstado().equals(EstadoExamen.aprobado) && notas.get(i).getTipoDeNota().equals(TipoDeNota.SegundoParc))) {
			return cargar= true;
		}
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