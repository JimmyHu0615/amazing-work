package com.hlj.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlj.crm.mapper.BaseDictMapper;
import com.hlj.crm.po.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> queryBaseDict(String typeId) {

		List<BaseDict> list = baseDictMapper.queryBaseDict(typeId);
		return list;
	}

}
