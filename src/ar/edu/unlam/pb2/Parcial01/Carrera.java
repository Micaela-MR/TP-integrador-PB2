package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Carrera {
	
	private Integer id;
	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList<Alumno> alumnos;
	
	public Carrera(Integer id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.materias = new ArrayList<Materia>();
		this.alumnos = new ArrayList<Alumno>();
	}
	
<<<<<<< Updated upstream
=======
     public Boolean agregarMateria(Materia materia) {
    	 if(!buscarMateriaPorId(materia.getId())) {
    		 materias.add(materia);
    		 return true;
    	 }else {
    		 return false;
    	 }
		
	}
     private boolean buscarMateriaPorId(Integer idMateria) {
 		Boolean materiaEncontradaPorId = false;
 		for (int i = 0; i < materias.size(); i++) {
 			if(this.materias.get(i).getId()== idMateria) {
 				materiaEncontradaPorId = true;
 			}
 		}
 		return materiaEncontradaPorId;
 	}
      private Materia buscarMateriaPorIdQueDevuelveLaMateria(Integer idMateria) {
 		Materia materiaEncontradaPorId = null;
 		for (int i = 0; i < materias.size(); i++) {
 			if(this.materias.get(i).getId()== idMateria) {
 				materiaEncontradaPorId = this.materias.get(i);
 			}
 		}
 		return materiaEncontradaPorId;
 	}
      
      public Boolean agregarCorrelatividad(Integer idMateria, Integer idCorrelativa) {
  		Boolean seAgregoCorrelativa = false;
          for (int i = 0; i < materias.size(); i++) {
        	  for (int j = 0; j < materias.size(); j++) {
  			if(materias.get(i).getId() == idMateria && materias.get(j).getId() == idCorrelativa ) {
  				Materia correlativaNueva = buscarMateriaPorIdQueDevuelveLaMateria(idCorrelativa);
  				correlativas.add(correlativaNueva);
  				 seAgregoCorrelativa = true;
  			}
  		}
          }
  		return seAgregoCorrelativa;
  	}

	/**public Boolean agregarAlumno(Alumno alumno) { // de Mica
		Boolean seAgrego = false;
		    	if (! this.buscarAlumnoPorDni (alumno.getDni())) {
		    		alumnos.add(alumno);
		    		seAgrego = true;
		    	}
		    	return seAgrego;
 	}
	
	public Boolean buscarAlumnoPorDni(Integer dniAlumno) { // de Mica
		Boolean alumnoEncontradoPorDni = false;
		for (int i = 0; i < alumnos.size(); i++) {
			if(this.alumnos.get(i).getDni()== dniAlumno) {
				alumnoEncontradoPorDni = true;
			}
		}
		return alumnoEncontradoPorDni;
	}**/
     
     public String obtenerMateriasAprobadasParaUnAlumno(Integer idAlumno) {
    	 return "nop";
     }
>>>>>>> Stashed changes
	
    public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Materia> getMaterias() {
		return materias;
	}


	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}


	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	


	public Boolean agregarMateria(Materia materia) {
		return null;
	}
     
    public Boolean agregarAlumno(Alumno alumno) {
		return null;
 	}
     
    public String obtenerMateriasAprobadasParaUnAlumno(Integer idAlumno) {
    	return "nop";
    }
	
	public Integer obtenerNota(Integer idAlumno, Integer idMateria) {
		return 0;
	}
	
	public String obtenerMateriasQueFaltanCursarParaUnAlumno(Integer idAlumno) {
		return "nop";
	}
	
	public Double calcularPromedio(Integer idAlumno) {
		return 0.0;
	}
}