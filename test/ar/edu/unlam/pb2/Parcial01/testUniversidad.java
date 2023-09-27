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
	public void RegistrarUnAlumnoEnLaCarrera() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Alumno alumno = new Alumno (1, 12345678, "Micaela", "Mendez", "03-06-2002");
		
		unlam.agregarCarrera(desarrolloWeb);
		Boolean alumnoAgregado = desarrolloWeb.agregarAlumno(alumno);
		
		assertTrue(alumnoAgregado);
	}
	
	@Test
	public void NoRegistrarDosAlumnoConElMismoDniEnLaMismaCarrera() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Alumno alumno = new Alumno (1, 12345678, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno2 = new Alumno (2, 12345678, "Noelia", "Noe", "03-06-2002");
		
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
		unlam.agregarCarrera(desarrolloWeb);
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
		Profesor juanMa = new Profesor(02, 35555555, "JuanManuel", "Monteagudo" );
		
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		Boolean profesorAgregado = pb2.agregarDocentes(juanMa);
		
		assertTrue(profesorAgregado);
	}
	
	@Test
	public void NoRegistrarDosDocentesConElMismoDniEnLaMismaMateria() {
		Universidad unlam = new Universidad ("UNLaM");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor juanMa = new Profesor(02, 35555555, "JuanManuel", "Monteagudo" );
		Profesor andi = new Profesor (01, 35555555, "AndresGerardo", "Borgeat");
		
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarDocentes(juanMa);
		Boolean profesorAgregado = pb2.agregarDocentes(andi);
		
		assertFalse(profesorAgregado);
	}
	
	@Test
	public void asignarUnDocenteAUnaComisión() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor luciano = new Profesor (03, 37777777, "LucianoEzequiel", "Salgado");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarComision(comision1);
		pb2.agregarDocentes(luciano);
		
		Boolean DocenteAsignado = pb2.asignarProfesorAlaComision(1, 37777777);
		
		assertTrue(DocenteAsignado);
	}
	
	@Test
	public void queNoSePuedaAsignarDosDocentesConElMismoDniAUnaComisión() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor andi = new Profesor (01, 366666666, "AndresGerardo", "Borgeat");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		pb2.agregarComision(comision1);
		pb2.agregarDocentes(andi);
		pb2.asignarProfesorAlaComision(1, 366666666);
		
		Boolean DocenteAsignado = pb2.asignarProfesorAlaComision(1, 366666666);
		
		assertFalse(DocenteAsignado);
	}
	
	@Test
	public void agregarUnNuevoDocenteAUnaComisiónCadaVeinteAlumnos() throws ParseException { //da rojo
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Profesor juanMa = new Profesor(02, 35555555, "JuanManuel", "Monteagudo" );
		Profesor luciano = new Profesor (03, 37777777, "LucianoEzequiel", "Salgado");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno2 = new Alumno (2, 11111112, "Noelia", "Noe", "03-06-2002");
		Alumno alumno3 = new Alumno (3, 12345678, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno4 = new Alumno (4, 23456789, "Noelia", "Noe", "03-06-2002");
		Alumno alumno5 = new Alumno (5, 34567890, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno6 = new Alumno (6, 45678901, "Noelia", "Noe", "03-06-2002");
		Alumno alumno7 = new Alumno (7, 56789012, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno8 = new Alumno (8, 67890123, "Noelia", "Noe", "03-06-2002");
		Alumno alumno9 = new Alumno (9, 78901234, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno10 = new Alumno (10, 89012345, "Noelia", "Noe", "03-06-2002");
		Alumno alumno11 = new Alumno (11, 90123456, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno12 = new Alumno (12, 01234567, "Noelia", "Noe", "03-06-2002");
		Alumno alumno13 = new Alumno (13, 11111111, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno14 = new Alumno (14, 22222222, "Noelia", "Noe", "03-06-2002");
		Alumno alumno15 = new Alumno (15, 33333333, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno16 = new Alumno (16, 44444444, "Noelia", "Noe", "03-06-2002");
		Alumno alumno17 = new Alumno (17, 55555555, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno18 = new Alumno (18, 66666666, "Noelia", "Noe", "03-06-2002");
		Alumno alumno19 = new Alumno (19, 77777777, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno20 = new Alumno (20, 88888888, "Noelia", "Noe", "03-06-2002");
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
		
		desarrolloWeb.inscribirAlumnoAComision(43817073, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(11111112, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(12345678, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(23456789, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(34567890, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(45678901, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(56789012, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(67890123, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(78901234, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(89012345, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(90123456, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(01234567, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(11111111, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(22222222, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(33333333, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(44444444, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(55555555, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(66666666, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(77777777, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(88888888, 1,1);
		desarrolloWeb.inscribirAlumnoAComision(99999999, 1,1);
		
		pb2.agregarDocentes(juanMa);
		pb2.agregarDocentes(luciano);
		pb2.asignarProfesorAlaComision(1, 35555555);
		
		Boolean DocenteAsignado = pb2.asignarProfesorAlaComision(1, 37777777);
		
		assertFalse(DocenteAsignado);
	}
	
	@Test 
	public void queSePuedaAgregarUnaMateriaCorrelativa(){
		Universidad unlam = new Universidad("Unlam");
		Carrera ingenieria = new Carrera(01, "ingenieria");
		Materia programacion1 = new Materia(01, "programacion 1");
		Materia programacion2 = new Materia(02, "programacion 1");
		
		unlam.agregarCarrera(ingenieria);
		ingenieria.agregarMateria(programacion1);
		ingenieria.agregarMateria(programacion2);
		Boolean ve = ingenieria.agregarCorrelatividad((Integer)01, (Integer)02);
		
		assertTrue(ve);
	}
	
	@Test
	public void EliminarLaCorrelatividadDeUnaMateria() {
		
	}
	
	@Test
	public void registrarNotaDeUnAlumno() throws ParseException { //da rojo
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb1 = new Materia (1, "PB1");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		Evaluacion nota1 = new Evaluacion(TipoDeNota.PrimerParc, 7);
		
		unlam.agregarCarrera(desarrolloWeb);
		unlam.agregarCicloLectivo(segundoCuatri);
		desarrolloWeb.agregarMateria(pb1);
		desarrolloWeb.agregarAlumno(alumno);
		pb1.agregarComision(comision1);
		comision1.inscribirAlumnoAComision(alumno);
		Boolean notaAgregada = pb1.registrarNota(1, 1, nota1);
		
		assertFalse(notaAgregada);
	}
	
	@Test
	public void NoRegistrarUnaNotaMayorASieteSiElAlumnoNoAproboLaMateriaCorrelativa() throws ParseException {  //no está terminado
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb1 = new Materia (1, "PB1");
		Materia pb2 = new Materia (2, "PB2");
		//Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		
		unlam.agregarCarrera(desarrolloWeb);
		unlam.agregarCicloLectivo(segundoCuatri);
		desarrolloWeb.agregarMateria(pb1);
		desarrolloWeb.agregarMateria(pb2);
		desarrolloWeb.agregarAlumno(alumno);
		desarrolloWeb.agregarCorrelatividad(1, 2);
	}
	
	@Test
	public void inscribirAlumnoAComision() throws ParseException { //arreglar
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2024", "14-08-2024", "02-12-2024");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		Aula aula = new Aula (1, 30);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		desarrolloWeb.agregarAlumno(alumno);
		pb2.agregarComision(comision1);
		comision1.asignarAulaAlaComision(aula);
		
		Boolean alumnoAsignado = desarrolloWeb.inscribirAlumnoAComision(43817073, 1,1);
		
		assertTrue(alumnoAsignado);
	}
	
	@Test
	public void noInscribirAlumnoAComisionFueraDeLaFechaQueCorresponde() throws ParseException { //arreglar
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2024", "02-12-2024");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		Aula aula = new Aula (1, 30);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		desarrolloWeb.agregarAlumno(alumno);
		pb2.agregarComision(comision1);
		comision1.asignarAulaAlaComision(aula);
		
		Boolean alumnoAsignado = desarrolloWeb.inscribirAlumnoAComision(43817073, 1,1);
		
		assertFalse(alumnoAsignado);
	}
	
	@Test
	public void noInscribirUnAlumnoAUnaComisionLlena() throws ParseException {
		Universidad unlam = new Universidad ("UNLaM");
		CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2024", "14-08-2024", "02-12-2024");
		Carrera desarrolloWeb = new Carrera (1,"Desarrollo Web");
		Materia pb2 = new Materia (1, "PB2");
		Comision comision1 = new Comision (1, "T", segundoCuatri);
		Alumno alumno = new Alumno (1, 43817073, "Micaela", "Mendez", "03-06-2002");
		Alumno alumno2 = new Alumno (2, 11111112, "Noelia", "Noe", "03-06-2002");
		Aula aula = new Aula (1, 1);
		
		unlam.agregarCicloLectivo(segundoCuatri);
		unlam.agregarCarrera(desarrolloWeb);
		desarrolloWeb.agregarMateria(pb2);
		desarrolloWeb.agregarAlumno(alumno);
		desarrolloWeb.agregarAlumno(alumno2);
		pb2.agregarComision(comision1);
		comision1.asignarAulaAlaComision(aula);
		
		desarrolloWeb.inscribirAlumnoAComision(43817073, 1,1);
		Boolean alumnoAsignado = desarrolloWeb.inscribirAlumnoAComision(11111112, 1,1);
		
		assertFalse(alumnoAsignado);
	}
}