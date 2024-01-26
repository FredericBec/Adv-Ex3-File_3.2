package fr.fms.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Bill {

	private int billNumber;
	private String paymentType;
	private Order order;
	
	public Bill(int billNumber, String paymentType, Order order) {
		this.billNumber = billNumber;
		this.paymentType = paymentType;
		this.order = new Order(order.getOrderNumber(), order.getDishesList(), order.getDate(), order.getCustomer());
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	//méthode pour éditer la note
	public void showBill(Order order) {
		try {
			BufferedWriter bill = new BufferedWriter(new FileWriter("note.txt", true));
			
			bill.write("---------------- Note du menu " + order.getOrderNumber() + " ----------------");
			bill.write(this.getBillNumber() + "\t" + "Client : " + order.getCustomer());
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			String dateOrder = order.getDate().format(df);
			bill.write(dateOrder);
			
			for(String dish : order.getDishesList()) {
				bill.write(dish + "\n");
			}
			
			bill.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Bill [billNumber=" + billNumber + ", paymentType=" + paymentType + "]";
	}
}
