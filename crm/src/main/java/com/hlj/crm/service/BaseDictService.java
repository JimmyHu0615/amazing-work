package com.hlj.crm.service;

import java.util.List;

import com.hlj.crm.po.BaseDict;

public interface BaseDictService {

	List<BaseDict> queryBaseDict(String typeId);
}
