package com.hlj.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlj.crm.po.BaseDict;
import com.hlj.crm.po.Customer;
import com.hlj.crm.po.QueryVo;
import com.hlj.crm.service.BaseDictService;
import com.hlj.crm.service.CustomerService;
import com.hlj.crm.utils.Page;

@Controller
@RequestMapping("cust")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("list")
	public String toList(Model model,QueryVo queryVo) {
		List<BaseDict> fromType = baseDictService.queryBaseDict("002");
		List<BaseDict> industryType = baseDictService.queryBaseDict("001");
		List<BaseDict> levelType = baseDictService.queryBaseDict("006");
		
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		queryVo.setStart((queryVo.getPage()-1)*queryVo.getRows());
		Page<Customer> page = customerService.queryCustomerPage(queryVo);
		model.addAttribute("page", page);
		
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custSource", queryVo.getCustSource());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());
		
		return "customer";
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public Customer toEdit(Long id) {
		Customer customer = customerService.queryCustomerById(id);
		return customer;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public void update(Customer customer) {
		customerService.updateCustomer(customer);
	}
	
	@RequestMapping("delcust")
	@ResponseBody
	public void delete(Long id) {
		customerService.deleteCustomerById(id);
	}
}
