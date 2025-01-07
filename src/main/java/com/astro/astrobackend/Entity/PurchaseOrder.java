package com.astro.astrobackend.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PurchaseOrder {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long poId;

	    @Column(nullable = false)
	    private String tenderRequests; // Comma-separated tender requests

	    @Column(nullable = false)
	    private String correspondingIndents; // Comma-separated indent IDs

	    @Column(nullable = false)
	    private String materialDescription;

	    @Column(nullable = false)
	    private Integer quantity;

	    @Column(nullable = false)
	    private BigDecimal unitRate;

	    @Column(nullable = false)
	    private String currency;

	    private BigDecimal exchangeRate;

	    @Column(nullable = false)
	    private BigDecimal gstPercentage;
	    @Column(nullable = false)
	    private BigDecimal dutiesPercentage;

	    private BigDecimal freightCharges;

	    private LocalDate deliveryPeriod;

	    private String warranty;

	    private String consigneeAddress;

	    private String additionalTermsAndConditions;

	    private LocalDateTime createdDate = LocalDateTime.now();
	    private LocalDateTime updatedDate = LocalDateTime.now();
		public Long getPoId() {
			return poId;
		}
		public void setPoId(Long poId) {
			this.poId = poId;
		}
		public String getTenderRequests() {
			return tenderRequests;
		}
		public void setTenderRequests(String tenderRequests) {
			this.tenderRequests = tenderRequests;
		}
		public String getCorrespondingIndents() {
			return correspondingIndents;
		}
		public void setCorrespondingIndents(String correspondingIndents) {
			this.correspondingIndents = correspondingIndents;
		}
		public String getMaterialDescription() {
			return materialDescription;
		}
		public void setMaterialDescription(String materialDescription) {
			this.materialDescription = materialDescription;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public BigDecimal getUnitRate() {
			return unitRate;
		}
		public void setUnitRate(BigDecimal unitRate) {
			this.unitRate = unitRate;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public BigDecimal getExchangeRate() {
			return exchangeRate;
		}
		public void setExchangeRate(BigDecimal exchangeRate) {
			this.exchangeRate = exchangeRate;
		}
		public BigDecimal getGstPercentage() {
			return gstPercentage;
		}
		public void setGstPercentage(BigDecimal gstPercentage) {
			this.gstPercentage = gstPercentage;
		}
		public BigDecimal getDutiesPercentage() {
			return dutiesPercentage;
		}
		public void setDutiesPercentage(BigDecimal dutiesPercentage) {
			this.dutiesPercentage = dutiesPercentage;
		}
		public BigDecimal getFreightCharges() {
			return freightCharges;
		}
		public void setFreightCharges(BigDecimal freightCharges) {
			this.freightCharges = freightCharges;
		}
		public LocalDate getDeliveryPeriod() {
			return deliveryPeriod;
		}
		public void setDeliveryPeriod(LocalDate deliveryPeriod) {
			this.deliveryPeriod = deliveryPeriod;
		}
		public String getWarranty() {
			return warranty;
		}
		public void setWarranty(String warranty) {
			this.warranty = warranty;
		}
		public String getConsigneeAddress() {
			return consigneeAddress;
		}
		public void setConsigneeAddress(String consigneeAddress) {
			this.consigneeAddress = consigneeAddress;
		}
		public String getAdditionalTermsAndConditions() {
			return additionalTermsAndConditions;
		}
		public void setAdditionalTermsAndConditions(String additionalTermsAndConditions) {
			this.additionalTermsAndConditions = additionalTermsAndConditions;
		}
		public LocalDateTime getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(LocalDateTime createdDate) {
			this.createdDate = createdDate;
		}
		public LocalDateTime getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(LocalDateTime updatedDate) {
			this.updatedDate = updatedDate;
		}


}
