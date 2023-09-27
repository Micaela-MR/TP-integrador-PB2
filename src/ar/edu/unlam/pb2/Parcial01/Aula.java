package ar.edu.unlam.pb2.Parcial01;

public class Aula {

	private Integer id;
	private Integer cantidadDeAlumnos;
	
	public Aula(Integer id, Integer cantidadDeAlumnos) {
		this.id = id;
		this.cantidadDeAlumnos = cantidadDeAlumnos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidadDeAlumnos() {
		return cantidadDeAlumnos;
	}

	public void setCantidadDeAlumnos(Integer cantidadDeAlumnos) {
		this.cantidadDeAlumnos = cantidadDeAlumnos;
	}
	
	
}
