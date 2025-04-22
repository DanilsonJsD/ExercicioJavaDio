package services;

import java.util.ArrayList;
import java.util.List;

import models.Tabuada;

public class TabuadaService {

	public List<String> gerarTabuada(Tabuada tabuada){
		int numero = tabuada.getNumero();
		List<String> resultado = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			resultado.add(numero + " x " + i + " = "+ (numero*i));
		}
		return resultado;
		
	}
}
