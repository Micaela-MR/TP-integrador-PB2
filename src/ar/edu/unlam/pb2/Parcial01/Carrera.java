package ar.edu.unlam.pb2.Parcial01;

import java.util.ArrayList;


public class Carrera {
	
	private Integer id;
	private String nombre;
	private ArrayList<Materia> materias;
	private ArrayList <Materia> correlativas;
	private ArrayList<Alumno> alumnos;
	
	
	
	public Carrera(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.materias = new ArrayList<Materia>();
		this.alumnos = new ArrayList<Alumno>();
		this.correlativas = new ArrayList<Materia>();
	}
	

     public Boolean agregarMateria(Materia materia) {
    	 if(!buscarMateriaPorId(materia.getId())) {
    		 materias.add(materia);
    		 return true;
    	 }else {
    		 return false;
    	 }
		
	}
    public boolean buscarMateriaPorId(Integer idMateria) {
 		Boolean materiaEncontradaPorId = false;
 		for (int i = 0; i < materias.size(); i++) {
 			if(this.materias.get(i).getId()== idMateria) {
 				materiaEncontradaPorId = true;
 			}
 		}
 		return materiaEncontradaPorId;
 	}
      public Materia buscarMateriaPorIdQueDevuelveLaMateria(Integer idMateria) {
 		Materia materiaEncontradaPorId = null;
 		for (int i = 0; i < materias.size(); i++) {
 			if(this.materias.get(i).getId()== idMateria) {
 				materiaEncontradaPorId = this.materias.get(i);
 			}
 		}
 		return materiaEncontradaPorId;
 	}
      
  



      public Boolean agregarAlumno(Alumno alumno) { // de Mica
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
	}

     
    public Alumno buscarAlumnoPordniQueDevuelveElAlumno(Integer dniAlumno) {
		Alumno alumnoEncontradoPorDni = null;
		for (int i = 0; i < alumnos.size(); i++) {
			if(this.alumnos.get(i).getDni()== dniAlumno) {
				alumnoEncontradoPorDni = this.alumnos.get(i);
			}
		}
		return alumnoEncontradoPorDni;
		
	}
    
    public Alumno buscarAlumnoPorIdQueDevuelveElAlumno(Integer idAlumno) {
 		Alumno alumnoEncontradoPorId = null;
 		for (int i = 0; i < alumnos.size(); i++) {
 			if(this.alumnos.get(i).getId()== idAlumno) {
 				alumnoEncontradoPorId = this.alumnos.get(i);
 			}
 		}
 		return alumnoEncontradoPorId;
 		
 	}
    
    
    public ArrayList <Materia> obtenerMateriasAprobadasParaUnAlumno(Integer idAlumno){
		Alumno alumno = this.buscarAlumnoPorIdQueDevuelveElAlumno(idAlumno);	
		return alumno.getMateriasAprobadas();
	}

   public ArrayList <Materia> obtenerMateriasQueFaltanCursarParaUnAlumno(Integer idAlumno){
	   Alumno alumno = this.buscarAlumnoPorIdQueDevuelveElAlumno(idAlumno);
	   for (int i = 0; i < this.materias.size(); i++) {
		for (int j = 0; j < alumno.getMateriasAprobadas().size(); j++) {
			if(this.materias.get(i).getId()!=alumno.getMateriasAprobadas().get(j).getId()) {
				alumno.getMateriasPorAprobar().add(this.materias.get(i));
			}
		}
	}
	   return alumno.getMateriasPorAprobar();
   }

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
	
	public Double calcularPromedio(Integer idAlumno) {
		 Alumno alumno = this.buscarAlumnoPorIdQueDevuelveElAlumno(idAlumno);
		 Double promedio = 0.0;
		 for (int j = 0; j < alumno.getNotas().size(); j++) {
			 alumno.getNotas().get(j);		 
				Double suma = 0.0;
				
					suma += alumno.getNotas().get(j).getNota();
					promedio = (Double) suma / alumno.getNotas().size();
					
					
			}
		
		return promedio;
	}
}

