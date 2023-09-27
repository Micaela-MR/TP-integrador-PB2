package ar.edu.unlam.pb2.Parcial01;

public class Evaluacion {
	
	private TipoDeNota tipoDeNota;
	private Double nota;
	private EstadoExamen estado;
	private Materia materia;
	private Alumno alumno;

	public Evaluacion (TipoDeNota tipoDeNota, Double nota, Materia materia, Alumno alumno) {
		this.tipoDeNota=tipoDeNota;
		this.nota=nota;
		this.estado=this.estadoDelExamen(nota);
		this.materia = materia;
		this.alumno = alumno;
	}

	public TipoDeNota getTipoDeNota() {
		return tipoDeNota;
	}

	public void setTipoDeNota(TipoDeNota tipoDeNota) {
		this.tipoDeNota = tipoDeNota;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	

	public EstadoExamen getEstado() {
		return estado;
	}

	public void setEstado(EstadoExamen estado) {
		this.estado = estado;
	}
	
	

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public EstadoExamen estadoDelExamen(Double nota) {
		EstadoExamen estadoDelExamen = null;
		if(nota < 4.0) {
			estadoDelExamen = estadoDelExamen.desaprobado;
		} else if(nota >= 4.0 && nota<7.0) {
			estadoDelExamen = estadoDelExamen.aprobado;
		} else {
			estadoDelExamen = estadoDelExamen.promocion;
		}
		return estadoDelExamen;
	}

}
