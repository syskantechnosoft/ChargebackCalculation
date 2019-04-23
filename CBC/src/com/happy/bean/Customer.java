package com.happy.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	//@OneToMany
	//@JoinColumn(name = "customer_id")
	//@Column(name = "customer_id")
	//private List<Refund> refund;

	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "account_number")
	private BigInteger accountNumber;
	@Column(name = "chargeback_amount")
	private double chargebackAmount;
	@Column(name = "chargeback_date")
	private Date chargebackDate;
	private String reason;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getChargebackAmount() {
		return chargebackAmount;
	}

	public void setChargebackAmount(double chargebackAmount) {
		this.chargebackAmount = chargebackAmount;
	}

	public Date getChargebackDate() {
		return chargebackDate;
	}

	public void setChargebackDate(Date chargebackDate) {
		this.chargebackDate = chargebackDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", accountNumber="
				+ accountNumber + ", chargebackAmount=" + chargebackAmount + ", chargebackDate=" + chargebackDate
				+ ", reason=" + reason + "]";
	}

}
