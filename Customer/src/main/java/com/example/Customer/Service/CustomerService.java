package com.example.Customer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.Dao.CustomerDao;
import com.example.Customer.Entity.CustomerEntity;


@Service
public class CustomerService {
	@Autowired
     CustomerDao cd;
	
	public String addInfo(CustomerEntity ce) {
		return cd.addInfo(ce);
	}


}
