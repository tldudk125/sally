package org.zerock.domain;

public class CategoryVO {
	private int cateNo;
	private String cateParent;
	public int getCateNo() {
		return cateNo;
	}
	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}
	public String getCateParent() {
		return cateParent;
	}
	public void setCateParent(String cateParent) {
		this.cateParent = cateParent;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	private String cateName;
}
