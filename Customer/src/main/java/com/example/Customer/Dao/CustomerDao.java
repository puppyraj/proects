

package com.example.Customer.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Customer.Entity.CustomerEntity;
import com.example.Customer.Repo.CustomerRepo;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepo cr;
	public String addInfo(CustomerEntity  ce) {
		cr.save(ce);
		return "data has been stored in db";
	}

}
