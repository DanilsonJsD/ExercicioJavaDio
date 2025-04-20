package controller;

import java.util.List;

import model.Tabuada;
import service.TabuadaService;

public class TabuadaController {
	private final TabuadaService service; 
	
	public TabuadaController() {
		this.service = new TabuadaService();
	}

	public List<String> processarTabuada(int numero){
		Tabuada tabuada = new Tabuada(numero);
		return service.gerarTabuada(tabuada);
	}
	
}
