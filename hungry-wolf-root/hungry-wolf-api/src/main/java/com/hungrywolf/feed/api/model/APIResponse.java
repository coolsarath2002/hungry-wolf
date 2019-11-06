package com.hungrywolf.feed.api.model;

import java.util.List;

public class APIResponse<T>  {

	private List<T> items;
	private Integer statusCd;
	private String statusMsg;
	private String statusPic;
	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public String getStatusPic() {
		return statusPic;
	}
	public void setStatusPic(String statusPic) {
		this.statusPic = statusPic;
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}
	public Integer getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(Integer statusCd) {
		this.statusCd = statusCd;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
}
