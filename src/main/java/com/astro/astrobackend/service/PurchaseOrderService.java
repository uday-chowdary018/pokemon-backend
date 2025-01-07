package com.astro.astrobackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.astrobackend.Dto.PurchaseOrderDto;
import com.astro.astrobackend.Entity.PurchaseOrder;
import com.astro.astrobackend.Repository.PurchaseOrderRepo;
import com.astro.astrobackend.Util.commonUtils;


@Service
public class PurchaseOrderService {
	
	  @Autowired
	    private PurchaseOrderRepo poRepository;

	    // Create a new PO
	    public PurchaseOrder createPurchaseOrder(PurchaseOrderDto poDto) {
	        PurchaseOrder purchaseOrder = new PurchaseOrder();
	        purchaseOrder.setTenderRequests(poDto.getTenderRequests());
	        purchaseOrder.setCorrespondingIndents(poDto.getCorrespondingIndents());
	        purchaseOrder.setMaterialDescription(poDto.getMaterialDescription());
	        purchaseOrder.setQuantity(poDto.getQuantity());
	        purchaseOrder.setUnitRate(poDto.getUnitRate());
	        purchaseOrder.setCurrency(poDto.getCurrency());
	        purchaseOrder.setExchangeRate(poDto.getExchangeRate());
	        purchaseOrder.setGstPercentage(poDto.getGstPercentage());
	        purchaseOrder.setDutiesPercentage(poDto.getDutiesPercentage());
	        purchaseOrder.setFreightCharges(poDto.getFreightCharges());
	        // Convert the delivery period string to a date
	        String deliveryPeriod = poDto.getDeliveryPeriod();  // Assuming it's a string like "01/02/2025"
	        purchaseOrder.setDeliveryPeriod(commonUtils.convertStringToDateObject(deliveryPeriod));
	        purchaseOrder.setWarranty(poDto.getWarranty());
	        purchaseOrder.setConsigneeAddress(poDto.getConsigneeAddress());
	        purchaseOrder.setAdditionalTermsAndConditions(poDto.getAdditionalTermsAndConditions());
	        return poRepository.save(purchaseOrder);
	    }
	public PurchaseOrder updatePurchaseOrder(Long id, PurchaseOrderDto poDto) {
		PurchaseOrder existingPO = poRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Purchase Order not found with id: " + id));

		// Update the fields
		existingPO.setTenderRequests(poDto.getTenderRequests());
		existingPO.setCorrespondingIndents(poDto.getCorrespondingIndents());
		existingPO.setMaterialDescription(poDto.getMaterialDescription());
		existingPO.setQuantity(poDto.getQuantity());
		existingPO.setUnitRate(poDto.getUnitRate());
		existingPO.setCurrency(poDto.getCurrency());
		existingPO.setExchangeRate(poDto.getExchangeRate());
		existingPO.setGstPercentage(poDto.getGstPercentage());
		existingPO.setDutiesPercentage(poDto.getDutiesPercentage());
		existingPO.setFreightCharges(poDto.getFreightCharges());
		String deliveryPeriod = poDto.getDeliveryPeriod();
		existingPO.setDeliveryPeriod(commonUtils.convertStringToDateObject(deliveryPeriod));
		existingPO.setWarranty(poDto.getWarranty());
		existingPO.setConsigneeAddress(poDto.getConsigneeAddress());
		existingPO.setAdditionalTermsAndConditions(poDto.getAdditionalTermsAndConditions());

		return poRepository.save(existingPO);
	}


	// Get all POs
	    public List<PurchaseOrder> getAllPurchaseOrders() {
	        return poRepository.findAll();
	    }

	    // Get a PO by ID
	    public PurchaseOrder getPurchaseOrderById(Long poId) {
	        return poRepository.findById(poId).orElseThrow(() -> new RuntimeException("PO not found!"));
	    }

	    // Delete a PO
	    public void deletePurchaseOrder(Long poId) {
	        poRepository.deleteById(poId);

	    }
	


}
