package com.sit.homeloan.dto;

import com.sit.homeloan.enums.DocumentType;

import lombok.Data;

@Data
public class DocumentDto {
	 private Long id;
	    private String name;
	    private String documentType;
	    private String verificationStatus;
	    private String fileType;  
	    private String data;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDocumentType() {
			return documentType;
		}
		public void setDocumentType(String documentType) {
			this.documentType = documentType;
		}
		public String getVerificationStatus() {
			return verificationStatus;
		}
		public void setVerificationStatus(String verificationStatus) {
			this.verificationStatus = verificationStatus;
		}
		public String getFileType() {
			return fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
}
