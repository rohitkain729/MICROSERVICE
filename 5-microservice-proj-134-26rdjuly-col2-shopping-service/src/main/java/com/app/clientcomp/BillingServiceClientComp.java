package com.app.clientcomp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("Billing-Service")
public interface BillingServiceClientComp {

	
	@GetMapping("/billing-api/payment")
	public String invokeDoPayment();
	
	@GetMapping("/billing-api/payment/{cardNo}")
	public String invokeDoPayment1(@PathVariable("cardNo")long cardNo);
}
