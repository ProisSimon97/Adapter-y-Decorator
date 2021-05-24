package ar.unrn.tp5.modelo;

public class CarneAdicional extends Adicionales {
	public CarneAdicional(Combo combo) {

		super(" + Carne", combo);
	}

	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 250 + combo.precio();
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return combo.descripcionDelCombo() + this.descripcion;
	}
}
