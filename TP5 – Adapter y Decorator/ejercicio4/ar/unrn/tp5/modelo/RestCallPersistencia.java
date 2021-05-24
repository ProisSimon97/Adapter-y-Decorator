package ar.unrn.tp5.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RestCallPersistencia implements RestCall {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private String url;
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	private RestCall call;

	public RestCallPersistencia(RestCall call, String url) {

		this.call = call;
		this.url = url;
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
		String sqlUpdate = "Insert texto SET textoCall = ?";

		try {

			Connection conexion = (Connection) this.conexion();
			PreparedStatement ps = (PreparedStatement) ((java.sql.Connection) conexion).prepareStatement(sqlUpdate);

			ps.setString(1, texto);

			ps.executeUpdate();
			ps.close();
			conexion.close();

		} catch (SQLException e) {
			throw new Exception("Error" + e);
		}
	}

	public Connection conexion() throws ClassNotFoundException, SQLException {

		Connection conexion = null;

		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(this.url, USUARIO, CLAVE);

		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("Error al cargar el controlador");

		} catch (SQLException e) {
			throw new SQLException("Error en la conexion");
		}

		return conexion;
	}
}
