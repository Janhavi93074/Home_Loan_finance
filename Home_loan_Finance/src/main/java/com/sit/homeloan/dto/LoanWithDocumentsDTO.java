package com.sit.homeloan.dto;

import java.util.List;


import com.sit.homeloan.model.Document;
import com.sit.homeloan.model.LoanApplication;

import lombok.Data;
@Data
public class LoanWithDocumentsDTO {

    private LoanApplication loan;
    private List<DocumentDto> documents;
	public LoanApplication getLoan() {
		return loan;
	}
	public void setLoan(LoanApplication loan) {
		this.loan = loan;
	}
	public List<DocumentDto> getDocuments() {
		return documents;
	}
	public void setDocuments(List<DocumentDto> documents) {
		this.documents = documents;
	}
}
