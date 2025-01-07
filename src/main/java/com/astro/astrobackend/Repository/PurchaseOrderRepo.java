package com.astro.astrobackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astro.astrobackend.Entity.PurchaseOrder;

public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrder, Long> {

}
