package ar.unrn.tp5.test;

import static org.junit.Assert.assertThrows;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import ar.unrn.tp5.modelo.ReporteDecorador;
import ar.unrn.tp5.modelo.ReporteBase;

public class TestReport {

	@Test

	public void reporteSinVerificacion() throws IOException {

		File file = new File("C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\Trabajos\\TP5\\archivo_punto2.txt");

		ReporteBase report = new ReporteBase("Hola");

		Assertions.assertDoesNotThrow(() -> report.export(file));
	}

	@Test

	public void reporteConVerificacion() throws IOException {

		File file = new File("C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\Trabajos\\TP5\\archivo_punto2.txt");

		ReporteDecorador report = new ReporteDecorador(new ReporteBase("Hey"));

		assertThrows(IllegalArgumentException.class, () -> {
			report.export(file);
		});
	}
}
