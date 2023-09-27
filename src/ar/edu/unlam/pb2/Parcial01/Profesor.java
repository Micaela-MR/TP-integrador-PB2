package ar.edu.unlam.pb2.Parcial01;

public class Profesor {

	private Integer id;
	private Integer dni;
	private String nombre;
	private String apellido;
	
	public Profesor(Integer id, Integer dni, String nombre, String apellido) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
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
	
	
}
