package com.oop.consumer;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AddressRestConsumer {
	
	private DiscoveryClient discoveryClient;
	
	public AddressRestConsumer(DiscoveryClient discoveryClient) {
		super();
		this.discoveryClient = discoveryClient;
	}

	  public String callAddressShowMsg() { 
		  
	  List<ServiceInstance> list = discoveryClient.getInstances("ADDRESS-SERVICE");
	  
	   ServiceInstance si = list.get(0);
	  
	  String uri = si.getUri()+"/addr/show";
	  
	  RestTemplate restTemplate = new RestTemplate();
	  String resp = restTemplate.getForObject(uri,String.class);
	
	  return resp; 
	  }	 
}
