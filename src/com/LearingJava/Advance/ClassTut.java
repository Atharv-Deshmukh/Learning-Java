package com.LearingJava.Advance;

class Product{
	private int Id;
	private String name;
	
	// Getters and Setters
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + "]";
	}
	
}

public class ClassTut {

	public static void main(String[] args) {
		Product p = new Product();
		p.setId(1);
		p.setName("My Prd");
		System.out.println(p.toString());

	}

}
