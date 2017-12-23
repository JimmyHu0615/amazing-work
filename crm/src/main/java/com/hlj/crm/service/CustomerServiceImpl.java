package com.hlj.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlj.crm.mapper.CustomerMapper;
import com.hlj.crm.po.Customer;
import com.hlj.crm.po.QueryVo;
import com.hlj.crm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public Page<Customer> queryCustomerPage(QueryVo queryVo) {

		Integer count = customerMapper.queryCustomerCount(queryVo);
		List<Customer> list = customerMapper.queryCustomerPage(queryVo);
		Page<Customer> page = new Page<>(count, queryVo.getPage(), queryVo.getRows(), list);
		return page;
	}

	@Override
	public Customer queryCustomerById(Long id) {

		return customerMapper.queryCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {

		customerMapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomerById(Long id) {
		customerMapper.deleteCustomerById(id);
	}

}
