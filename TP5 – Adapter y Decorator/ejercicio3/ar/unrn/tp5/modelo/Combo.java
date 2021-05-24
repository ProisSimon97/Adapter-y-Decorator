package ar.unrn.tp5.modelo;

public abstract class Combo {

	protected String descripcion;
	
	protected Combo(String descripcion) {
		
		this.descripcion = descripcion;
	}
	
	public abstract int precio();
	
	public abstract String descripcionDelCombo();
}
