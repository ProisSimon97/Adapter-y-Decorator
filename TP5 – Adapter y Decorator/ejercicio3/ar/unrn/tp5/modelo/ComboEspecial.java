package ar.unrn.tp5.modelo;

public class ComboEspecial extends Combo {

	public ComboEspecial() {

		super("Hamburgesa Grande y Papas Grande" + "+ Gaseosa grande x 2");
	}

	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 750;
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}
}
