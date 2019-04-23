package com.happy.bean;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {
	@Id
	@Column(name = "loan_id")
	private int loadId;
	@Column(name = "account_number")
	private BigInteger accountNumber;
	@Column(name = "loan_amount")
	private double loanAmount;
	@Column(name = "no_of_years")
	private int noOfYears;
	@Column(name = "interest_rate")
	private double interestRate;
	@Column(name = "sanction_date")
	private Date sanctionDate;
	@Column(name = "emi_amount")
	private double emiAmount;

	public int getLoadId() {
		return loadId;
	}

	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getSanctionDate() {
		return sanctionDate;
	}

	public void setSanctionDate(Date sanctionDate) {
		this.sanctionDate = sanctionDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	@Override
	public String toString() {
		return "Loan [loadId=" + loadId + ", accountNumber=" + accountNumber + ", loanAmount=" + loanAmount
				+ ", noOfYears=" + noOfYears + ", interestRate=" + interestRate + ", sanctionDate=" + sanctionDate
				+ ", emiAmount=" + emiAmount + "]";
	}

}
