package ar.unrn.tp5.modelo;

public class TomateAdicional extends Adicionales {

	public TomateAdicional(Combo combo) {

		super(" + Tomate", combo);
	}

	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 100 + combo.precio();
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return combo.descripcionDelCombo() + this.descripcion;
	}
}
