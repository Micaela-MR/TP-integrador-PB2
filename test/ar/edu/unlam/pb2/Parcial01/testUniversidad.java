package ar.edu.unlam.pb2.Parcial01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class testUniversidad {

		@Test
		public void queSePuedaAgregarMateria() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			
			
			unlam.agregarCarrera(ingenieria);
			Boolean ve = ingenieria.agregarMateria(programacion);
			
			assertTrue(ve);
		}
		@Test 
		public void queSePuedaBuscarMateriaPorId() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Integer idProgramacion = programacion.getId();
			unlam.agregarCarrera(ingenieria);
			ingenieria.agregarMateria(programacion);
			Boolean ve = ingenieria.buscarMateriaPorId(idProgramacion);
			
			assertTrue(ve);
			
		}
		
		@Test
		public void queSePuedaBuscarMateriaPorIdYDevuelvaMateria() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Integer idProgramacion = programacion.getId();
			unlam.agregarCarrera(ingenieria);
			ingenieria.agregarMateria(programacion);
			Materia ve = programacion;
			Materia vo = ingenieria.buscarMateriaPorIdQueDevuelveLaMateria(idProgramacion);
			
			assertEquals(ve, vo);
		}
		
		@Test
		public void agregarUnNuevoCicloLectivoALaUniversidad() throws ParseException  {
			Universidad unlam = new Universidad ("UNLaM");
			CicloLectivo segundoCuatri = new CicloLectivo (1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			
			Boolean cicloLectivoAgregado = unlam.agregarCicloLectivo(segundoCuatri);
			
			assertTrue(cicloLectivoAgregado);
		}
		
		@Test
		public void queSePuedaAgregarUnDocenteAMateria() throws ParseException {
			Universidad unlam = new Universidad("Unlam");		
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Profesor JuanMa = new Profesor(02, 35555555, "JuanManuel", "Monteagudo" );
			Boolean ve = programacion.agregarDocentes(JuanMa);
			
			assertTrue(ve);
		}
		
		@Test
		public void queSePuedaBuscarDocentePorDni() {
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Profesor JuanMa = new Profesor(02, 35555555, "JuanManuel", "Monteagudo" );
			programacion.agregarDocentes(JuanMa);
			Integer dniDocente = JuanMa.getDni();
			Boolean ve = programacion.buscarDocentePorDniConNumero(dniDocente);
			
			assertTrue(ve);
			
		}
		
		
		@Test 
		public void queSePuedaAgregarUnaMateriaCorrelativa() throws ParseException {
			Universidad unlam = new Universidad("Unlam");	
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion1 = new Materia(01, "programacion1", ingenieria);
			Materia programacion2 = new Materia(02, "programacion2", ingenieria);
			ingenieria.agregarMateria(programacion1);
			ingenieria.agregarMateria(programacion2);
			Boolean ve = programacion1.agregarCorrelatividad((Integer)01, (Integer)02);
			
			assertTrue(ve);
		}
		

		
		
		
		@Test
		public void queSePuedaInscribirAlumnoAComision() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");
			ingenieria.agregarAlumno(noelia);
			programacion.agregarComision(borgeat);
			Integer idComision = borgeat.getId();
			Integer dniAlumno = noelia.getDni();
			Boolean ve = borgeat.inscribirAlumnoAComision(idComision, dniAlumno);
			
			assertTrue(ve);
		}
		
		@Test
		public void quesePuedaAgregarAlumnoACarrera() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");
			Boolean ve = ingenieria.agregarAlumno(noelia);
			
			assertTrue(ve);
		}
		
		@Test
		public void quesePuedaBuscarAlumnoPordniQueDevuelveElAlumno() {
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");
			ingenieria.agregarAlumno(noelia);
			Integer dniAlumno = noelia.getDni();
			Alumno va = ingenieria.buscarAlumnoPordniQueDevuelveElAlumno(dniAlumno);
			
			assertEquals(noelia, va);
			
		}
		@Test
		public void queSePuedaObtenerNota() throws ParseException{
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");		
		
			Evaluacion nota = new Evaluacion(TipoDeNota.PrimerParc, 7.0, programacion, noelia);
			Integer idComision = borgeat.getId();
			Integer idAlumno = noelia.getId();
			Integer idMateria = programacion.getId();
			programacion.registrarNota(idComision, idAlumno, nota);
			Double va = programacion.obtenerNota(idAlumno, idMateria);
			Double ve = 7.0;
		
			assertEquals(ve, va);
		}
		
		@Test
		public void queSePuedaRegistrarUnaNota() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");		
		
			Evaluacion nota = new Evaluacion(TipoDeNota.PrimerParc, 7.0, programacion, noelia);
			Integer idComision = borgeat.getId();
			Integer idAlumno = noelia.getId();
			Integer idMateria = programacion.getId();
			Boolean ve =  programacion.registrarNota(idComision, idAlumno, nota);
			
			assertTrue(ve);

		}
		@Test 
		public void queSePuedaBuscarAlumnoPorDni() {
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");
			ingenieria.agregarAlumno(noelia);
			Integer dniAlumno = noelia.getDni();
			Boolean ve = ingenieria.buscarAlumnoPorDni(dniAlumno);
			
			assertTrue(ve);
			
		}
		
		@Test
		public void queSePuedaAgregarComicionAMateria() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Boolean ve = programacion.agregarComision(borgeat);
			
			assertTrue(ve);
		}
		
		
		
		
		
		@Test
		public void queSePuedaAsignarAulaAUnaComision() throws ParseException {
			Universidad unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(1, "31-07-2023", "03-08-2023", "14-08-2023", "02-12-2023");
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Materia programacion = new Materia(01, "programacion", ingenieria);
			Comision borgeat = new Comision(3900,"noche",ingenieria, programacion, anio2023);
			Profesor JuanMa = new Profesor(02, 35555555, "JuanManuel", "Monteagudo" );
			programacion.agregarComision(borgeat);
			programacion.agregarDocentes(JuanMa);
			Integer dniProfesor = JuanMa.getDni();
			Aula va = borgeat.asignarAulaAlaComision(3900, dniProfesor);
			Aula ve = new Aula(01,20);
			assertEquals(ve, va);
		}
		
		@Test
		public void queSePuedanObtenerMateriasAprobadasParaUnAlumno() {
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");
			ingenieria.agregarAlumno(noelia);
			Integer idAlumno = noelia.getId();
			ArrayList <Materia> va = ingenieria.obtenerMateriasAprobadasParaUnAlumno(idAlumno);
			ArrayList <Materia> ve = new ArrayList<Materia>();
			
			assertEquals(ve, va);
		}
		
		@Test
		public void queSePuedanObtenerMateriasQueFaltanCursarParaUnAlumno() {
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Alumno noelia = new Alumno(01, 35603447, "Noelia", "Cabrera", "01-10-1990");
			ingenieria.agregarAlumno(noelia);
			Integer idAlumno = noelia.getId();
			ArrayList <Materia> va = ingenieria.obtenerMateriasQueFaltanCursarParaUnAlumno(idAlumno);
			ArrayList <Materia> ve = new ArrayList<Materia>();
			
			assertEquals(ve, va);
		}
		

	}

