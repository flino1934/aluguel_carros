package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.entities.Carrental;
import model.entities.Vehicle;
import model.entities.sevices.BrazilTaxService;
import model.entities.sevices.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		String model = JOptionPane.showInputDialog("Modelo do carro: ");
		Date start = sdf.parse(JOptionPane.showInputDialog("Data de retirada do veiculo: "));
		Date finish = sdf.parse(JOptionPane.showInputDialog("Darta de entrada de veiculo"));
				
		Carrental cr = new Carrental(start, finish, new Vehicle(model));
		
		double pricePerDay = Double.parseDouble(JOptionPane.showInputDialog("Preço da diaria: "));
		double pricePerHour = Double.parseDouble(JOptionPane.showInputDialog("Preço por hora: "));
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(cr);//Passa cr pq o process invoice pede como argumento CarRental
		
		System.out.println("Dados: ");
		System.out.println("Modelo do carro: "+cr.getVehicle().getModel());
		System.out.println("Valor: "+cr.getInvoice().getBasicPayment());
		System.out.println("Taxa: "+cr.getInvoice().getTax());
		System.out.println("Valor total: "+cr.getInvoice().totalPayment());
		
				

	}

}
