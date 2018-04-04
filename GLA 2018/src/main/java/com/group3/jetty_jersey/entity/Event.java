package com.group3.jetty_jersey.entity;

import java.util.Date;

public class Event {
	private long id_event;
	private String name;
	private double X,Y;
	private String place;
	private String picture;
	private Date startDate,endingDate;
	private Map map;
	//private List<String> comments;
	
	
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
	public long getId_event() {
		return id_event;
	}
	public void setId_event(long id_event) {
		this.id_event = id_event;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}
	
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	
	/*public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}*/
	
	
}