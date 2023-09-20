package ar.edu.unlam.pb2.Parcial01;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class testUniversidad {

		@Test
		public void queSePuedaAgregarMateria() {
			Universidad unlam = new Universidad("Unlam");
			//CicloLectivo anio2023 = new CicloLectivo(2023, "03/03/2023", "02/12/2013", "28/08/2022", "09/09/2022" );
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Comision borgeat = new Comision(3900,"noche");
			Materia programacion = new Materia(01, "programacion", borgeat);
			
			unlam.agregarCarrera(ingenieria);
			Boolean ve = ingenieria.agregarMateria(programacion);
			
			assertTrue(ve);
		}
		
		@Test
		public void queSePuedaAgregarUnCicloLectivo() {
			Universidad unlam = new Universidad("Unlam");
			Date inicioCicloLectivo = unlam.establecerFechas(3,3,2023);
			Date finalCicloLectivo = unlam.establecerFechas(2,12,2023);
			Date fechaInicioInscripcion = unlam.establecerFechas(28,8,2023);
			Date fechaFinalizacionInscripcion = unlam.establecerFechas(9,9,2023);		
			CicloLectivo anio2023 = new CicloLectivo(2023, inicioCicloLectivo, finalCicloLectivo,fechaInicioInscripcion,fechaFinalizacionInscripcion);
			Boolean ve= unlam.agregarCicloLectivo(anio2023);
		    
			assertTrue(ve);
		}
		
	}

