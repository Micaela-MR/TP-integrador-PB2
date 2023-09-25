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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidadDeAlumnos == null) ? 0 : cantidadDeAlumnos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		if (cantidadDeAlumnos == null) {
			if (other.cantidadDeAlumnos != null)
				return false;
		} else if (!cantidadDeAlumnos.equals(other.cantidadDeAlumnos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
