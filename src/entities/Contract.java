package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer nummber;
	private Date date;
	private Double totalValue;

	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
		
	}
	
	public Contract(Integer nummber, Date date, Double totalValue) {
		super();
		this.nummber = nummber;
		this.date = date;
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public Integer getNummber() {
		return nummber;
	}

	public void setNummber(Integer nummber) {
		this.nummber = nummber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	
}
