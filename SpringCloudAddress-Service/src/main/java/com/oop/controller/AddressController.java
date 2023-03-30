package com.oop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addr")
public class AddressController {
	
	@GetMapping("/show")
	public String showMsg() {
		return "From  ADDRESS";
	}

}
