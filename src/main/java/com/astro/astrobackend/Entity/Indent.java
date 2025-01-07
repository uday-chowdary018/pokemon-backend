package com.astro.astrobackend.Entity;

public class Indent {

	 private String indentorName;
	    private String contactDetails;
	    private String materialJobCode;
	    private String consigneeLocation;
	    private String budgetCode;
	    private String projectName;
	    private Integer quantity;
	    private Boolean preBidMeetingRequired;
	    private LocalDateTime preBidStartDate;
	    private LocalDateTime preBidEndDate;
	    private String technicalDocumentsUrl;
		public String getIndentorName() {
			return indentorName;
		}
		public void setIndentorName(String indentorName) {
			this.indentorName = indentorName;
		}
		public String getContactDetails() {
			return contactDetails;
		}
		public void setContactDetails(String contactDetails) {
			this.contactDetails = contactDetails;
		}
		public String getMaterialJobCode() {
			return materialJobCode;
		}
		public void setMaterialJobCode(String materialJobCode) {
			this.materialJobCode = materialJobCode;
		}
		public String getConsigneeLocation() {
			return consigneeLocation;
		}
		public void setConsigneeLocation(String consigneeLocation) {
			this.consigneeLocation = consigneeLocation;
		}
		public String getBudgetCode() {
			return budgetCode;
		}
		public void setBudgetCode(String budgetCode) {
			this.budgetCode = budgetCode;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public Boolean getPreBidMeetingRequired() {
			return preBidMeetingRequired;
		}
		public void setPreBidMeetingRequired(Boolean preBidMeetingRequired) {
			this.preBidMeetingRequired = preBidMeetingRequired;
		}
		public LocalDateTime getPreBidStartDate() {
			return preBidStartDate;
		}
		public void setPreBidStartDate(LocalDateTime preBidStartDate) {
			this.preBidStartDate = preBidStartDate;
		}
		public LocalDateTime getPreBidEndDate() {
			return preBidEndDate;
		}
		public void setPreBidEndDate(LocalDateTime preBidEndDate) {
			this.preBidEndDate = preBidEndDate;
		}
		public String getTechnicalDocumentsUrl() {
			return technicalDocumentsUrl;
		}
		public void setTechnicalDocumentsUrl(String technicalDocumentsUrl) {
			this.technicalDocumentsUrl = technicalDocumentsUrl;
		}
	    
}
