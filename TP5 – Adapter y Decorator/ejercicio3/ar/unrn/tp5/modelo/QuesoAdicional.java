package ar.unrn.tp5.modelo;

public class QuesoAdicional extends Adicionales {

	public QuesoAdicional(Combo combo) {
		
		super(" + Queso", combo);
	}
	
	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 200 + combo.precio();
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return combo.descripcionDelCombo() + this.descripcion;
	}
}
