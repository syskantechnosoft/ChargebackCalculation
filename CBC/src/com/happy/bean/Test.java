package com.happy.bean;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Test {

	public static double calcuteEMI(Loan l) {
		double emi = 0;
		double loanAmount = l.getLoanAmount();
		double interestRate = l.getInterestRate();
		int noOfYears = l.getNoOfYears();

		emi = (loanAmount + (loanAmount * (interestRate / 100))) / (noOfYears * 12);
		return emi;
	}

	public static double calculateChargeback(Loan l, Emi e) {
		double chargeback = 0;
		LocalDate dueDateLocal = LocalDate.of(e.getDueDate().getYear(), e.getDueDate().getMonth(),
				e.getDueDate().getDate());
		if (e.getPaidDate() == null) {

			if (dueDateLocal.isBefore(LocalDate.now())) {
				chargeback = l.getEmiAmount() * 0.001;
			}
		} 
//		else if (e.getPaidDate() != null) {
//			LocalDate paidDateLocal = LocalDate.of(e.getPaidDate().getYear(), e.getPaidDate().getMonth(),
//					e.getPaidDate().getDate());
//			if (dueDateLocal.isBefore(paidDateLocal)) {
//				chargeback = l.getEmiAmount() * 0.001;
//			}
//		}
		return chargeback;
	}

	public static void main(String[] args) {

		ZoneId defaultZoneId = ZoneId.systemDefault();
		LocalDate ld = LocalDate.now();
		ld = ld.minusDays(60);
		LocalDate dd = LocalDate.now().minusDays(30);
		Date sanctionDate = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
		Date dueDate = Date.from(dd.atStartOfDay(defaultZoneId).toInstant());
		Customer cust1 = new Customer();
		cust1.setCustomerId(100);
		cust1.setAccountNumber(new BigInteger("100200300400143"));
		cust1.setCustomerName("ABCD");

		Loan l1 = new Loan();
		l1.setAccountNumber(new BigInteger("100200300400143"));
		l1.setLoanAmount(100000);
		l1.setNoOfYears(2);
		l1.setInterestRate(10);
		l1.setLoadId(1000);
		l1.setSanctionDate(sanctionDate);
		l1.setEmiAmount(calcuteEMI(l1));

		Emi e1 = new Emi();
		e1.setLoanId(1000);
		e1.setDueDate(dueDate);

		System.out.println("Customer Details" + cust1);
		System.out.println("Loan Details" + l1);
		System.out.println("EMI Details" + e1);

		cust1.setChargebackAmount(calculateChargeback(l1, e1));
		cust1.setChargebackDate(new Date());
		cust1.setReason("Late Fee");
		System.out.println("**************************************************************************************");
		System.out.println("Customer Details" + cust1);
		System.out.println("Loan Details" + l1);
		System.out.println("EMI Details" + e1);

	}

}
