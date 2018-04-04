package com.group3.jetty_jersey.entity;

import java.util.List;

public class Map {

	private long id_map;
	private String name;
	private List<String> categories;
	
	
	public long getId_map() {
		return id_map;
	}
	public void setId_map(long id_map) {
		this.id_map = id_map;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	

}