package model.entities.sevices;

import model.entities.Carrental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private TaxServices taxService;

	public RentalService() {
		// TODO Auto-generated constructor stub
	}

	public RentalService(Double pricePerDay, Double pricePerHour, TaxServices taxService) {

		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public void processInvoice(Carrental carrental) {

		long t1 = carrental.getStart().getTime();// Vai calcular o tempo em mile sugundos
		long t2 = carrental.getFinish().getTime();// Vai calcular o tempo em mile segundos

		double hours = (double) (t2 - t1) / 1000 / 60 / 60;
		double basicPayment;

		if (hours <= 12.0) {

			basicPayment = Math.ceil(hours) * pricePerHour;

		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerHour;
		}

		double tax = taxService.tax(basicPayment);// Passa o valor do aluguel para o classe BrazilTaxService calcular o
													// imposto
		carrental.setInvoice(new Invoice(basicPayment, tax));// Vai jogar dentro da classe carrental e da classe
																// carrental vai para a invoice

	}

}
