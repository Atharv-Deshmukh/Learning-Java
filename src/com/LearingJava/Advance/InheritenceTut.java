package com.LearingJava.Advance;

class Product1{
	private int Id;
	private String name;
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

class Mobile extends Product1{ // Here, Product is parent and Mobile is Child
	private String model;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + "]";
	}
	
	public String Info() {
		return "Mobile Information [Id=" + this.getId() + " Model="+ this.model +"]";
	}
}

public class InheritenceTut {

	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		mb.setId(4);
		mb.setName("Mobile");
		mb.setModel("M2 PRO");
		System.out.println(mb.Info());

	}

}
