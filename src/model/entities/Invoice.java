package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double tax;

	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public Invoice(Double basicPayment, Double tax) {

		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double totalPayment() {

		return getBasicPayment() + getTax();// Vai pegar a taxa mais o valor que vira das classes de servi�o

	}
	


}
