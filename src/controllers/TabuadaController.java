package controllers;

import java.util.List;

import models.Tabuada;
import services.TabuadaService;

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
