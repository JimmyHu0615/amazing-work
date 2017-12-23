package com.hlj.crm.service;

import com.hlj.crm.po.Customer;
import com.hlj.crm.po.QueryVo;
import com.hlj.crm.utils.Page;

public interface CustomerService {

	Page<Customer> queryCustomerPage(QueryVo queryVo);
	
	Customer queryCustomerById(Long id);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomerById(Long id);
}
