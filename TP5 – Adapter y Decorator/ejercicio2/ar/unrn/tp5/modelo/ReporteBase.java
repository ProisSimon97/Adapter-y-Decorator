package ar.unrn.tp5.modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReporteBase implements Reporte {

	private String reporte;

	public ReporteBase(String reporte) {

		this.reporte = reporte;
	}

	public void export(File file) throws IOException {

		if (file == null)
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");

		file.createNewFile();
		Files.write(Paths.get(file.getPath()), this.reporte.getBytes(), StandardOpenOption.APPEND);
	}
}
