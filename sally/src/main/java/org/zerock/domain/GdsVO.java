package org.zerock.domain;

import java.util.Date;

public class GdsVO {
	private int gdsNum;
	private String gdsName;
	private int gdsPrice;
	private int gdsStock;
	private String gdsDes;
	private Date gdsDate;
	private int cateNo;
	public int getGdsNum() {
		return gdsNum;
	}
	public void setGdsNum(int gdsNum) {
		this.gdsNum = gdsNum;
	}
	public String getGdsName() {
		return gdsName;
	}
	public void setGdsName(String gdsName) {
		this.gdsName = gdsName;
	}
	public int getGdsPrice() {
		return gdsPrice;
	}
	public void setGdsPrice(int gdsPrice) {
		this.gdsPrice = gdsPrice;
	}
	public int getGdsStock() {
		return gdsStock;
	}
	public void setGdsStock(int gdsStock) {
		this.gdsStock = gdsStock;
	}
	public String getGdsDes() {
		return gdsDes;
	}
	public void setGdsDes(String gdsDes) {
		this.gdsDes = gdsDes;
	}
	public Date getGdsDate() {
		return gdsDate;
	}
	public void setGdsDate(Date gdsDate) {
		this.gdsDate = gdsDate;
	}
	public int getCateNo() {
		return cateNo;
	}
	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}
}
