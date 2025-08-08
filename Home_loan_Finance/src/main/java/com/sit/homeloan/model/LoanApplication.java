package com.sit.homeloan.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sit.homeloan.enums.ApplicationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loan_applications")
public class LoanApplication {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference(value = "customer-loanApplications") 
    @JsonIgnore
    private Customer customer;


    private Double loanAmount;
    private Integer loanTenureInMonths;
    private String loanPurpose;
    private LocalDate applicationDate;
    private Double cibilScore;
    private String rejectionReason;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;

    @OneToOne(mappedBy = "loanApplication", cascade = CascadeType.ALL)
    private CreditEvaluation creditEvaluation;

    @OneToOne(mappedBy = "loanApplication", cascade = CascadeType.ALL)
    private SanctionLetter sanctionLetter;

    @OneToOne(mappedBy = "loanApplication", cascade = CascadeType.ALL)
    private Disbursement disbursement;

    @OneToMany(mappedBy = "loanApplication", cascade = CascadeType.ALL)
    private List<LoanStageHistory> loanStageHistories;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getLoanTenureInMonths() {
		return loanTenureInMonths;
	}

	public void setLoanTenureInMonths(Integer loanTenureInMonths) {
		this.loanTenureInMonths = loanTenureInMonths;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Double getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(Double cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public CreditEvaluation getCreditEvaluation() {
		return creditEvaluation;
	}

	public void setCreditEvaluation(CreditEvaluation creditEvaluation) {
		this.creditEvaluation = creditEvaluation;
	}

	public SanctionLetter getSanctionLetter() {
		return sanctionLetter;
	}

	public void setSanctionLetter(SanctionLetter sanctionLetter) {
		this.sanctionLetter = sanctionLetter;
	}

	public Disbursement getDisbursement() {
		return disbursement;
	}

	public void setDisbursement(Disbursement disbursement) {
		this.disbursement = disbursement;
	}

	public List<LoanStageHistory> getLoanStageHistories() {
		return loanStageHistories;
	}

	public void setLoanStageHistories(List<LoanStageHistory> loanStageHistories) {
		this.loanStageHistories = loanStageHistories;
	}
}