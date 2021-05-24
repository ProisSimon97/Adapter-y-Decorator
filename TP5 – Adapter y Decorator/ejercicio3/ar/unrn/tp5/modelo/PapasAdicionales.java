package ar.unrn.tp5.modelo;

public class PapasAdicionales extends Adicionales {

	public PapasAdicionales(Combo combo) {
		
		super(" + Papas", combo);
	}
	
	@Override
	public int precio() {
		// TODO Auto-generated method stub
		return 195 + combo.precio();
	}

	@Override
	public String descripcionDelCombo() {
		// TODO Auto-generated method stub
		return combo.descripcionDelCombo() + this.descripcion;
	}
}
