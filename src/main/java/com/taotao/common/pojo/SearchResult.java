package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

public class SearchResult implements Serializable	{
	private long totalPages;
	private List<SearchItem> itemList;
	public long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}
	public List<SearchItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<SearchItem> itemList) {
		this.itemList = itemList;
	}
	public long getRecrodCount() {
		return recrodCount;
	}
	public void setRecrodCount(long recrodCount) {
		this.recrodCount = recrodCount;
	}
	private long recrodCount;
	
}
