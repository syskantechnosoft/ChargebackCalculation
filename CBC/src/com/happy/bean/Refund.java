package com.happy.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Refund {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "refund_id")
	private int refundId;
	@Column(name = "customer_id")
	private int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Column(name = "refund_date")
	private Date refundDate;
	@Column(name = "refund_amount")
	private double refundAmount;
	@Column(name = "refund_status")
	private String refundStatus;
	private String comments;

	public int getRefundId() {
		return refundId;
	}

	public void setRefundId(int refundId) {
		this.refundId = refundId;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Refund [refundId=" + refundId + ", customerId=" + customerId + ", refundDate=" + refundDate
				+ ", refundAmount=" + refundAmount + ", refundStatus=" + refundStatus + ", comments=" + comments + "]";
	}

}
