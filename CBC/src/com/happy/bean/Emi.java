package com.happy.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emi {
	@Id
	@Column(name = "loan_id")
	private int loanId;
	@Column(name = "due_date")
	private Date dueDate;
	@Column(name = "paid_date")
	private Date paidDate;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	@Override
	public String toString() {
		return "Emi [loanId=" + loanId + ", dueDate=" + dueDate + ", paidDate=" + paidDate + "]";
	}

}
