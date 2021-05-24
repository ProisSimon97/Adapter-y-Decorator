package ar.unrn.tp5.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class RestCallDisco implements RestCall {

	private RestCall call;
	private String path;

	public RestCallDisco(RestCall call, String path) {

		this.call = call;
		this.path = path;
	}

	@Override
	public String run() throws Exception {
		// TODO Auto-generated method stub
		String texto = this.call.run();

		this.write(texto);

		return texto;
	}

	@Override
	public void write(String texto) throws Exception {
		// TODO Auto-generated method stub
		try {
			Files.write(Paths.get(this.path), texto.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new Exception("No se pudo persistir", e);
		}
	}
}
