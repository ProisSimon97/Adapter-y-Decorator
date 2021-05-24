package ar.unrn.tp5.modelo;

import java.io.File;
import java.io.IOException;

public class ReporteDecorador implements Reporte {

	private Reporte reporte;

	public ReporteDecorador(Reporte reporte) {

		this.reporte = reporte;
	}

	@Override
	public void export(File file) throws IOException {
		// TODO Auto-generated method stub
		if (file.exists())
			throw new IllegalArgumentException("El archivo ya existe...");

		this.reporte.export(file);
	}
}
