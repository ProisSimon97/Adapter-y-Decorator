package ar.unrn.tp5.modelo;

public abstract class Adicionales extends Combo {

	protected Combo combo;

	public Adicionales(String descripcion, Combo combo) {
		
		super(descripcion);
		this.combo = combo;
	}

	@Override
	public abstract int precio();

	@Override
	public abstract String descripcionDelCombo();
}
