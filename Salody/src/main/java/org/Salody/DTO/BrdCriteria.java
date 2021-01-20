package org.Salody.DTO;

public class BrdCriteria {

	private int pageNum;
	
	private int inAmount;
	
	private String search;
	
	private String keyword;

	@Override
	public String toString() {
		return "BrdCriteria [pageNum=" + pageNum + ", inAmount=" + inAmount + ", search=" + search + ", keyword="
				+ keyword + "]";
	}
	public BrdCriteria() { 
		this(1,10); 
		
	}
	public BrdCriteria(int pageNum, int inAmount) {
		this.pageNum=pageNum;
		this.inAmount=inAmount;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getInAmount() {
		return inAmount;
	}
	public void setInAmount(int inAmount) {
		this.inAmount = inAmount;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
