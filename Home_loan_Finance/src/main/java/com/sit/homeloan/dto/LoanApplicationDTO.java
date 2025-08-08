package com.sit.homeloan.dto;

import java.time.LocalDate;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplicationDTO {
    private Long id;
    private String applicantName;
    private Double loanAmount;
    private Integer loanTenureInMonths;
    private String loanPurpose;
    private String applicationStatus;
    private LocalDate applicationDate;
    private Double cibilScore;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
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
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
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
    
}


