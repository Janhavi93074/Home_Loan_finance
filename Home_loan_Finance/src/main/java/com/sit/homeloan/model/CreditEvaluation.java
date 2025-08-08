package com.sit.homeloan.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credit_evaluations")
public class CreditEvaluation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private LoanApplication loanApplication;

    private Double debtToIncomeRatio;
    private Double approvedAmount;
    private Double interestRate;
    private String evaluationRemarks;
    private String evaluationStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LoanApplication getLoanApplication() {
		return loanApplication;
	}
	public void setLoanApplication(LoanApplication loanApplication) {
		this.loanApplication = loanApplication;
	}
	public Double getDebtToIncomeRatio() {
		return debtToIncomeRatio;
	}
	public void setDebtToIncomeRatio(Double debtToIncomeRatio) {
		this.debtToIncomeRatio = debtToIncomeRatio;
	}
	public Double getApprovedAmount() {
		return approvedAmount;
	}
	public void setApprovedAmount(Double approvedAmount) {
		this.approvedAmount = approvedAmount;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public String getEvaluationRemarks() {
		return evaluationRemarks;
	}
	public void setEvaluationRemarks(String evaluationRemarks) {
		this.evaluationRemarks = evaluationRemarks;
	}
	public String getEvaluationStatus() {
		return evaluationStatus;
	}
	public void setEvaluationStatus(String evaluationStatus) {
		this.evaluationStatus = evaluationStatus;
	}
}
