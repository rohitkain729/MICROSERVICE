package com.app.clientcomp;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.ms.model.Vendor;

@FeignClient("Vendor-Service")
public interface VendorServiceClientComp {

	@GetMapping("/vendor/all")
	public List<Vendor> getAllProduct();
}
