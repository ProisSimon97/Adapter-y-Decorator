package ar.unrn.tp5.modelo;

public class ComboFamiliar extends Combo {

	public ComboFamiliar() {

		super("Hamburgesa x 2 y Papas Grandes x 2" + " + Gaseosa grande");
	}

	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return this.descripcion;
	}
}
