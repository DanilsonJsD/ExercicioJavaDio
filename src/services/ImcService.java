package services;

import models.Pessoa;

public class ImcService {
	
	public double gerarImc(Pessoa p) {
		return p.getPeso()/(p.getAltura()*p.getAltura());
	}
	
	public String classificarImc(double imc) {		
		if(imc <= 18.5) return "Abaixo do peso";
		if(imc <= 24.5)	return "Peso ideal";
		if(imc <= 29.9)	return "Levemente acima do peso";
		if(imc <= 34.9) return "Obesidade I";
		if(imc <= 39.9) return "Obesidade II (Severa)";
		return "Obesidade III (Mórbida)";
	}
}
