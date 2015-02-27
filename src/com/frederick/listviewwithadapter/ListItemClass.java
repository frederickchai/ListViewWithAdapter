package com.frederick.listviewwithadapter;

public class ListItemClass {

	public String name;
	public String lname;
	public int age;
	
	public ListItemClass(String n, String a, int e){
		this.name 	= n;
		this.lname 	= a;
		this.age	= e;
	}
	
	public String getName() {
		return name;
	} 
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getLName() {
		return lname;
	} 
	
	public void setLName(String l) {
		this.lname = l;
	}
	
	public int getAge() {
		return age;
	} 
	
	public void setAge(int a) {
		this.age = a;
	}
}
