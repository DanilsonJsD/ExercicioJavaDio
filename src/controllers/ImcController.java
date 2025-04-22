package controllers;

import models.Pessoa;
import services.ImcService;

public class ImcController {
	private final ImcService service;

	public ImcController() {
		this.service = new ImcService();
	}

	public String processarImc(String nome, double peso, double altura) {
		Pessoa pessoa = new Pessoa(nome, peso, altura);
		double imc = service.gerarImc(pessoa);
		String classificacao = service.classificarImc(imc);
		return String.format("%s, seu IMC é %.2f: %s", nome, imc, classificacao);
	}
}
