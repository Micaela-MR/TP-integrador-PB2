package ar.edu.unlam.pb2.Parcial01;

public class Evaluacion {
	
	private TipoDeNota tipoDeNota;
	private Integer nota;
	private EstadoExamen estado;
	private Materia materia;
	private Alumno alumno;

	public Evaluacion (TipoDeNota tipoDeNota, Integer nota, Materia materia, Alumno alumno) {
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

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
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

	public EstadoExamen estadoDelExamen(Integer nota) {
		EstadoExamen estadoDelExamen = null;
		if(nota < 4) {
			estadoDelExamen = estadoDelExamen.desaprobado;
		} else if(nota >= 4 && nota<7) {
			estadoDelExamen = estadoDelExamen.aprobado;
		} else {
			estadoDelExamen = estadoDelExamen.promocion;
		}
		return estadoDelExamen;
	}

}
