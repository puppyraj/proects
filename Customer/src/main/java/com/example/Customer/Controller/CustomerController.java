package com.example.Customer.Controller;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Entity.CustomerEntity;
import com.example.Customer.Service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerService cs;
	@PostMapping(value="/add")
	public String addInfo(@RequestBody CustomerEntity ce) {
		return cs.addInfo(ce);
	}

}
