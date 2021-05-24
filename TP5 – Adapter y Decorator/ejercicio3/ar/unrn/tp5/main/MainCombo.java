package ar.unrn.tp5.main;

import ar.unrn.tp5.modelo.CarneAdicional;
import ar.unrn.tp5.modelo.Combo;
import ar.unrn.tp5.modelo.ComboFamiliar;
import ar.unrn.tp5.modelo.PapasAdicionales;
import ar.unrn.tp5.modelo.TomateAdicional;

public class MainCombo {

	public static void main(String[] args) {

		Combo comboFamiliar = new ComboFamiliar();

		TomateAdicional tomate = new TomateAdicional(comboFamiliar);

		PapasAdicionales papa = new PapasAdicionales(tomate);
		
		CarneAdicional carne = new CarneAdicional(papa);

		System.out.println(carne.descripcionDelCombo());
		System.out.println(carne.precio());
	}
}
