package com.hlj.crm.mapper;

import java.util.List;

import com.hlj.crm.po.Customer;
import com.hlj.crm.po.QueryVo;

public interface CustomerMapper {

	List<Customer> queryCustomerPage(QueryVo queryVo);
	
	Integer queryCustomerCount(QueryVo queryVo);
	
	Customer queryCustomerById(Long id);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomerById(Long id);
}
