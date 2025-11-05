package com.app.clientcomp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceClientComp {

	@Autowired
	private DiscoveryClient client;

	public String invokeDoPayment() {
		// get service instance representing Provider ms form the eureka server
		List<ServiceInstance> instancelist = client.getInstances("Billing-Service");

		// u need to pick the service instance manually

		ServiceInstance instance = instancelist.get(0);

		// get details from the service instance

		String url = instance.getUri() + "/billing-api/payment";

		// get rest template class object

		RestTemplate template = new RestTemplate();

		// invoke the service of the provider ms

		String result = template.getForObject(url, String.class);

		return result;
	}
}
