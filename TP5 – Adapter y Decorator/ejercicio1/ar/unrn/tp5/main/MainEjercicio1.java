package ar.unrn.tp5.main;

import ar.unrn.tp5.modelo.Comun;
import ar.unrn.tp5.modelo.Economico;
import ar.unrn.tp5.modelo.Electrico;
import ar.unrn.tp5.modelo.ElectricoAdaptador;
import ar.unrn.tp5.modelo.Motor;

public class MainEjercicio1 {

	public static void main(String[] args) {

		Motor comun = new Comun();	
		
		Motor economico = new Economico();
		
		ElectricoAdaptador adapter = new ElectricoAdaptador(new Electrico());
		
		comun.arrancar();
		economico.arrancar();
		adapter.arrancar();
		adapter.acelerar();
		adapter.apagar();
		
	}

}
