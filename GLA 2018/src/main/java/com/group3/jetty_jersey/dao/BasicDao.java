package com.group3.jetty_jersey.dao;

import org.elasticsearch.index.query.QueryBuilder;

public interface BasicDao {
	
		String getAll(int begin,int end) throws Exception;
		
		
		String getByID(String id)throws Exception;
			
		
		String delete(String id)throws Exception;
		
		String add(byte[] json,String id)throws Exception;
		
		
		void update(String id,String attribut,String valeur)throws Exception;
		
		
		String searchByPages(QueryBuilder queryBuilder,int begin,int end)throws Exception;
	}
