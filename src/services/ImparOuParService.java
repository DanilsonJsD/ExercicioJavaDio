package services;

import java.util.ArrayList;
import java.util.List;
import models.ImparOuPar;

public class ImparOuParService {

	public List<String> checarImparOuPar(ImparOuPar iop) {
		int n1 = iop.getNum1();
		int n2 = iop.getNum2();
		List<String> resultado = new ArrayList<>();

		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				resultado.add(i + " É par");
			} else {
				resultado.add(i + " É impar");
			}
		}
		return resultado;
	}
}
