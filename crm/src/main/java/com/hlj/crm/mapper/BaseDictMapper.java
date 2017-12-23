package com.hlj.crm.mapper;

import java.util.List;

import com.hlj.crm.po.BaseDict;

public interface BaseDictMapper {

	List<BaseDict> queryBaseDict(String typeId);
}
