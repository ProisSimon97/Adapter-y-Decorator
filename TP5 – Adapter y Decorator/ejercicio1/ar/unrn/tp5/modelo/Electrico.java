package ar.unrn.tp5.modelo;

public class Electrico {

	private boolean estado;

	public Electrico() {
		this.estado = false;
	}

	public void conectar() {

		System.out.println("Conectar auto Electrico");
		this.estado = true;
	}

	public void activar() {

		if (!this.estado)
			System.out.println("No se pudo activar el motor");
		else {
			System.out.println("Activar Motor");
		}
	}

	public void moverMasRapido() {

		if (!this.estado)
			System.out.println("No se pudo acelerar porque el motor no esta conectado");
		else {
			System.out.println("Acelerando motor");
		}
	}

	public void deter() {

		if (!this.estado)
			System.out.println("No se pudo detener porque el motor no esta conectado");
		else {
			System.out.println("Detener motor");
		}
	}

	public void desconectar() {

		System.out.println("Apagar auto Electrico");
		this.estado = false;
	}

}
