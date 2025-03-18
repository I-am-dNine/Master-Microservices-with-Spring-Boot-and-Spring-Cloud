package com.microservices.limits_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limits_service.bean.Limits;

@RestController
public class LimitsController {

	@GetMapping("/limits")
	public Limits retrieveLitims() {
		return new Limits(1, 1000);
	}
	
}
