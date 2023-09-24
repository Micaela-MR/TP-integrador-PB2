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
	
	@Test
	public void asignarUnDocenteAUnaComisión() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor profe1 = new Profesor (1, 12345678, "Micaela", "Mendez");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarComision(comision1);
		pb2.agregarDocentes(profe1);
		
		Boolean DocenteAsignado = pb2.asignarProfesorAlaComision(1, 12345678);
		
		assertTrue(DocenteAsignado);
	}
	
	@Test
	public void queNoSePuedaAsignarDosDocentesConElMismoDniAUnaComisión() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor profe1 = new Profesor (1, 12345678, "Micaela", "Mendez");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarComision(comision1);
		pb2.agregarDocentes(profe1);
		pb2.asignarProfesorAlaComision(1, 24435612);
		
		Boolean DocenteAsignado = pb2.asignarProfesorAlaComision(1, 24435612);
		
		assertFalse(DocenteAsignado);
	}
	
	@Test
	public void agregarUnNuevoDocenteAUnaComisiónCadaVeinteAlumnos() throws ParseException { //arreglar
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor profe1 = new Profesor (1, 24435612, "Micaela", "Mendez");
		Profesor profe2 = new Profesor (2, 24435452, "Micaela", "Mendez");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno2 = new Alumno (2, 11111112, "Noelia", "Noe", "");
		Alumno alumno3 = new Alumno (3, 12345678, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno4 = new Alumno (4, 23456789, "Noelia", "Noe", "");
		Alumno alumno5 = new Alumno (5, 34567890, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno6 = new Alumno (6, 45678901, "Noelia", "Noe", "");
		Alumno alumno7 = new Alumno (7, 56789012, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno8 = new Alumno (8, 67890123, "Noelia", "Noe", "");
		Alumno alumno9 = new Alumno (9, 78901234, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno10 = new Alumno (10, 89012345, "Noelia", "Noe", "");
		Alumno alumno11 = new Alumno (11, 90123456, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno12 = new Alumno (12, 01234567, "Noelia", "Noe", "");
		Alumno alumno13 = new Alumno (13, 11111111, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno14 = new Alumno (14, 22222222, "Noelia", "Noe", "");
		Alumno alumno15 = new Alumno (15, 33333333, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno16 = new Alumno (16, 44444444, "Noelia", "Noe", "");
		Alumno alumno17 = new Alumno (17, 55555555, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno18 = new Alumno (18, 66666666, "Noelia", "Noe", "");
		Alumno alumno19 = new Alumno (19, 77777777, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno20 = new Alumno (20, 88888888, "Noelia", "Noe", "");
		Alumno alumno21 = new Alumno (21, 99999999, "Micaela", "Mendez", "03-06-2002");
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		desarrolloWeb.agregarAlumno(alumno);
		desarrolloWeb.agregarAlumno(alumno2);
		desarrolloWeb.agregarAlumno(alumno3);
		desarrolloWeb.agregarAlumno(alumno4);
		desarrolloWeb.agregarAlumno(alumno5);
		desarrolloWeb.agregarAlumno(alumno6);
		desarrolloWeb.agregarAlumno(alumno7);
		desarrolloWeb.agregarAlumno(alumno8);
		desarrolloWeb.agregarAlumno(alumno9);
		desarrolloWeb.agregarAlumno(alumno10);
		desarrolloWeb.agregarAlumno(alumno11);
		desarrolloWeb.agregarAlumno(alumno12);
		desarrolloWeb.agregarAlumno(alumno13);
		desarrolloWeb.agregarAlumno(alumno14);
		desarrolloWeb.agregarAlumno(alumno15);
		desarrolloWeb.agregarAlumno(alumno16);
		desarrolloWeb.agregarAlumno(alumno17);
		desarrolloWeb.agregarAlumno(alumno18);
		desarrolloWeb.agregarAlumno(alumno19);
		desarrolloWeb.agregarAlumno(alumno20);
		desarrolloWeb.agregarAlumno(alumno21);
		pb2.agregarComision(comision1);
		pb2.agregarDocentes(profe1);
		pb2.agregarDocentes(profe2);
		pb2.asignarProfesorAlaComision(1, 12345678);
		
		Boolean DocenteAsignado = pb2.asignarProfesorAlaComision(1, 24435452);
		
		assertTrue(DocenteAsignado);
	}
	
	@Test
	public void EliminarLaCorrelatividadDeUnaMateria() {
		
	}
}
