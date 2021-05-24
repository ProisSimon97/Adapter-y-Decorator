package ar.unrn.tp5.modelo;

public class ElectricoAdaptador implements Motor {

	private Electrico motor;

	public ElectricoAdaptador(Electrico electrico) {

		this.motor = electrico;
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		this.motor.conectar();
		this.motor.activar();
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		this.motor.moverMasRapido();
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		this.motor.deter();
		this.motor.desconectar();
	}
}
