package com.example.au.couchbasedemo.model;

import javax.persistence.Id;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

import java.util.*;

@Document
public class Bms {
	public Bms(String id, String moviename, List<String> city, String certification) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.city = city;
		this.certification = certification;
	}

	@Id
	String id;
	
	@NotNull
	@Field
	String moviename;
	
	@Field
	List <String> city;
	
	@Field
	String certification;
	
	public String getName() {
		return moviename;
	}
	
	public void setName(String name) {
		moviename=name;
	}
	
	public List<String> getCity(){
		return city;
	}
	
	public void setCity(List <String> citylist) {
		city=citylist;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getCertification() {
		return certification;
	}
	
	public void setCertification(String c) {
		certification=c;
	}
	
}
