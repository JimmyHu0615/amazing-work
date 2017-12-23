package com.hlj.crm.po;

/**
 * 用于综合查询
 * @author Jimmy Hu
 *
 */
public class QueryVo {

//	客户名称
	private String custName;
//	客户来源
	private String custSource;
//	客户所属行业
	private String custIndustry;
//	客户级别
	private String custLevel;
	
	//定义分页参数：当前页，每一页显示的大小，记录开始数
	private Integer page = 1;//默认查询第一页
	private Integer rows = 10;//每一页显示10条
	private Integer start;//需要计算
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}

	
}
