package com.example.au.couchbasedemo.model;

import javax.persistence.Id;

import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.Document;

import com.sun.istack.NotNull;

@Document
public class Football {
	public Football(String id, String playername, int totalgoals) {
		super();
		this.id = id;
		this.playername = playername;
		this.totalgoals = totalgoals;
	}

	@Id
	String id;
	
	@NotNull
	@Field
	String playername;
	
	@Field
	int totalgoals;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getTotalgoals() {
		return totalgoals;
	}

	public void setTotalgoals(int totalgoals) {
		this.totalgoals = totalgoals;
	}
	
	
}
