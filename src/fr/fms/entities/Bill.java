package fr.fms.entities;

public class Bill {

	private int billNumber;
	private String paymentType;
	private Order order;
	
	public Bill(int billNumber, String paymentType, Order order) {
		this.billNumber = billNumber;
		this.paymentType = paymentType;
		this.order = order;
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
	
	public void showBill() {
		
	}

	@Override
	public String toString() {
		return "Bill [billNumber=" + billNumber + ", paymentType=" + paymentType + "]";
	}
}
