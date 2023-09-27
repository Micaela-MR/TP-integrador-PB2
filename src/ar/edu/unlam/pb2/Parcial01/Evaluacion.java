package ar.edu.unlam.pb2.Parcial01;

public class Evaluacion {
	
	private TipoDeNota tipoDeNota;
	private Integer nota;
	private EstadoExamen estado;

	public Evaluacion (TipoDeNota tipoDeNota, Integer nota) {
		this.tipoDeNota=tipoDeNota;
		this.nota=nota;
		this.estado=this.estadoDelExamen(nota);
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
	
	
	
	public EstadoExamen getEstado() {
		return estado;
	}

	public void setEstado(EstadoExamen estado) {
		this.estado = estado;
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