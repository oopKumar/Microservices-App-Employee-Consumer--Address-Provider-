package com.oop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oop.consumer.AddressRestConsumer;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	AddressRestConsumer addressConsumer;
	
	@GetMapping("/info")
	public String getDetails(){
		
		return "From Emp=>"+addressConsumer.callAddressShowMsg();
	}

}
