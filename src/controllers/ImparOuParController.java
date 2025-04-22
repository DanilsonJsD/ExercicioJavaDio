package controllers;

import java.util.List;
import models.ImparOuPar;
import services.ImparOuParService;

public class ImparOuParController {
	private final ImparOuParService service;

	public ImparOuParController() {
		this.service = new ImparOuParService();
	}

	public List<String> processarImparOuPar(int num1, int num2) {
		ImparOuPar iop = new ImparOuPar(num1, num2);
		return service.checarImparOuPar(iop);
	}
}
