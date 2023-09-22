package ar.edu.unlam.pb2.Parcial01;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.text.ParseException;

import org.junit.Test;

public class testUniversidad {

	@Test
	public void agregarUnaMateriaALaCarrera() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		
		unlam.agregarCarrera(desarrolloWeb);
		Boolean materiaAgregada = desarrolloWeb.agregarMateria(pb2);
		
		assertTrue(materiaAgregada);
	}
	
	@Test
	public void noAgregarDosMateriasConMismoId() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Materia pb1 = new Materia (1, "PB1");
		
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		Boolean materiaAgregada = desarrolloWeb.agregarMateria(pb1);
		
		assertFalse(materiaAgregada);
	}

	@Test
	public void RegistrarUnAlumnoEnLaCarrera() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Alumno alumno = new Alumno (1, 12345678, "Micaela", "Mendez", "03-06-2002");
		
		unlam.agregarCarrera(desarrolloWeb);
		Boolean alumnoAgregado = desarrolloWeb.agregarAlumno(alumno);
		
		assertTrue(alumnoAgregado);
	}
	
	@Test
	public void NoRegistrarDosAlumnoConElMismoDniEnLaMismaCarrera() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Alumno alumno = new Alumno (1, 12345678, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno2 = new Alumno (2, 12345678, "Noelia", "Noe", "");
		
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarAlumno(alumno);
		Boolean alumnoAgregado = desarrolloWeb.agregarAlumno(alumno2);
		
		assertFalse(alumnoAgregado);
	}
	
	@Test
	public void agregarUnNuevoCicloLectivoALaUniversidad() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		
		Boolean cicloLectivoAgregado = unlam.agregarCicloLectivo(segundoCuatri);
		
		assertTrue(cicloLectivoAgregado);
	}
	
	@Test
	public void noAgregarDosCiclosLectivosConUnMismoId() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo primerCuatri = new CicloLectivo (1, "03-03-2023", "10-03-2023", "27-03-2023", "15-07-2023");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		
		unlam.agregarCicloLectivo(primerCuatri);
		Boolean cicloLectivoAgregado = unlam.agregarCicloLectivo(segundoCuatri);
		
		assertFalse(cicloLectivoAgregado);
	}
	
	@Test
	public void noAgregarUnCicloLectivoConFechasSuperpuestas() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "03-08-2023", "02-12-2023");
		
		Boolean cicloLectivoAgregado = unlam.agregarCicloLectivo(segundoCuatri);
		
		assertFalse(cicloLectivoAgregado);
	}
	
	@Test
	public void noAgregarUnCicloLectivoConFechasSuperpuestasAOtroCiclo() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo primerCuatri = new CicloLectivo (1, "03-03-2023", "10-03-2023", "27-03-2023", "03-08-2023");
		CicloLectivo segundoCuatri = new CicloLectivo (2, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		
		unlam.agregarCicloLectivo(primerCuatri);
		Boolean cicloLectivoAgregado = unlam.agregarCicloLectivo(segundoCuatri);
		
		assertFalse(cicloLectivoAgregado);
	}
	
	@Test
	public void agregarComisionesAUnaMateria() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Comision comision2 = new Comision (2, "M", segundoCuatri);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarComision(comision1);
		Boolean comisionAgregada = pb2.agregarComision(comision2);
		
		assertTrue(comisionAgregada);
	}
	
	@Test
	public void NoAgregarDosComisionesAUnaMateriaEnElMismoCicloLectivoYMismoTurno() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Materia pb2 = new Materia (1, "PB2");
		
		unlam.agregarCicloLectivo(segundoCuatri);
		
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Comision comision2 = new Comision (2, "T", segundoCuatri);
		
		pb2.agregarComision(comision1);
		Boolean comisionAgregada = pb2.agregarComision(comision2);
		
		assertFalse(comisionAgregada);
	}

	@Test
	public void RegistrarDocente() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor profe1 = new Profesor (1, 12345678, "Micaela", "Mendez");
		
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		Boolean profesorAgregado = pb2.agregarDocentes(profe1);
		
		assertTrue(profesorAgregado);
	}
	
	@Test
	public void NoRegistrarDosDocentesConElMismoDniEnLaMismaCarrera() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor profe1 = new Profesor (1, 12345678, "Micaela", "Mendez");
		Profesor profe2 = new Profesor (1, 12345678, "Noelia", "Noe");
		
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarDocentes(profe1);
		Boolean profesorAgregado = pb2.agregarDocentes(profe2);
		
		assertFalse(profesorAgregado);
	}
	
	/*@Test
	public void asignarCorrelatividadAUnaMateria() {
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb1 = new Materia (1, "PB1");
		Materia pb2 = new Materia (2, "PB2");
		
		Boolean correlatividadAgregada=desarrolloWeb.agregarCorrelatividad(1, 2);
		
		assertTrue(correlatividadAgregada);
	}
	
	@Test
	public void eliminarCorrelatividadAUnaMateria() {
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb1 = new Materia (1, "PB1");
		Materia pb2 = new Materia (2, "PB2");
		
		desarrolloWeb.agregarCorrelatividad(1, 2);
		Boolean correlatividadEliminada=desarrolloWeb.eliminarCorrelatividad(1, 2);
		
		assertTrue(correlatividadEliminada);
	}*/
	
	@Test
	public void asignarUnDocenteAUnaComisión() {
		
	}
	
	@Test
	public void QueNoSePuedaAsignarDosDocentesConElMismoDniAUnaComisión() {
		
	}
	
	@Test
	public void EliminarLaCorrelatividadDeUnaMateria() {
		
	}
}
