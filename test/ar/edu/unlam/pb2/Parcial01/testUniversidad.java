package ar.edu.unlam.pb2.Parcial01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testUniversidad {

		@Test
		public void queSePuedaAgregarMateria() {
			Universidad Unlam = new Universidad("Unlam");
			CicloLectivo anio2023 = new CicloLectivo(2023, "03/03/2023", "02/12/2013", "28/08/2022", "09/09/2022" );
			Carrera ingenieria = new Carrera(01, "ingenieria");
			Comision borgeat = new Comision(3900, anio2023, "noche");
			Materia programacion = new Materia(01, "programacion", borgeat);
			
			Unlam.agregarCarrera(ingenieria);
			Boolean ve = ingenieria.agregarMateria(programacion);
			
			assertTrue(ve);
		}
		
	}

