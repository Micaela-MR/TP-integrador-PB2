package ar.edu.unlam.pb2.Parcial01;

public class Aula {

	private Integer id;
	
	private final Integer CANTIDAD_MAXIMA_DE_ALUMNOS = 100;

	private Integer cantidadDeAlumnos;
	
	public Aula(Integer id, Integer cantidadDeAlumnos) {
		this.id = id;
		this.cantidadDeAlumnos = CANTIDAD_MAXIMA_DE_ALUMNOS;
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

	public Integer getCANTIDAD_MAXIMA_DE_ALUMNOS() {
		return CANTIDAD_MAXIMA_DE_ALUMNOS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CANTIDAD_MAXIMA_DE_ALUMNOS == null) ? 0 : CANTIDAD_MAXIMA_DE_ALUMNOS.hashCode());
		result = prime * result + ((cantidadDeAlumnos == null) ? 0 : cantidadDeAlumnos.hashCode());
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
		if (CANTIDAD_MAXIMA_DE_ALUMNOS == null) {
			if (other.CANTIDAD_MAXIMA_DE_ALUMNOS != null)
				return false;
		} else if (!CANTIDAD_MAXIMA_DE_ALUMNOS.equals(other.CANTIDAD_MAXIMA_DE_ALUMNOS))
			return false;
		if (cantidadDeAlumnos == null) {
			if (other.cantidadDeAlumnos != null)
				return false;
		} else if (!cantidadDeAlumnos.equals(other.cantidadDeAlumnos))
			return false;
		return true;
	}

     

	
	
	
}
