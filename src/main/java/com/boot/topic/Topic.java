package com.boot.topic;

public class Topic {
 private String Id;
 private String description;
 private String name;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Topic(String id, String description, String name) {
	super();
	Id = id;
	this.description = description;
	this.name = name;
}
 
 
}
