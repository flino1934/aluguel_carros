package model.entities;

import java.util.Date;

public class Carrental {

	private Date start;
	private Date finish;

	private Invoice invoice;
	private Vehicle vehicle;

	public Carrental() {
		// TODO Auto-generated constructor stub
	}

	public Carrental(Date start, Date finish, Vehicle vehicle) {// não passamos o invoice pois ainda não há uma nota de
																// pagamento

		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
