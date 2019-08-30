package model.entities.sevices;

public class BrazilTaxService implements TaxServices{//Vai implementar a classe TaxService e vai ser obrigada a cumprir o contrato da classe

	public double tax(double amount) {//Vai calcular o imposto
		
		if (amount <= 100.0) {
			return amount * 0.2;
		}else {
			return amount * 0.15;
		}
		
	}
	
}
