package ar.unrn.tp5.modelo;

public class ComboBasico extends Combo {

	public ComboBasico() {

		super("Hamburgesa y Papas pequ�as" + "+ Gaseosa peque�a");
	}

	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}
}
