package com.astro.astrobackend.Dto;

import java.math.BigDecimal;

public class PurchaseOrderDto {
	
	private String tenderRequests; // Comma-separated tender requests
    private String correspondingIndents; // Comma-separated indent IDs
    private String materialDescription;
    private Integer quantity;
    private BigDecimal unitRate;
    private String currency;
    private BigDecimal exchangeRate;
    private BigDecimal gstPercentage;
    private BigDecimal dutiesPercentage;
    private BigDecimal freightCharges;
    private String deliveryPeriod;
    private String warranty;
    private String consigneeAddress;
    private String additionalTermsAndConditions;
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
	public String getDeliveryPeriod() {
		return deliveryPeriod;
	}
	public void setDeliveryPeriod(String deliveryPeriod) {
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
	
	

}
