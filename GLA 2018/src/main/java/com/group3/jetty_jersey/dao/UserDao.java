package com.group3.jetty_jersey.dao;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;



public class UserDao implements BasicDao {
	String mainType;
	public UserDao (String mainType) {
		this.mainType=mainType;
	}
	

	public String getAll(int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String delete(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String add(byte[] json, String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(String id, String attribut, String valeur) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String searchByPages(QueryBuilder queryBuilder, int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String getByID(String id) throws Exception {
		// TODO Auto-generated method stub
		return "test";
	}

}
