package dev.amcosta.servlet;

public class Company {

	private Integer id;
	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public Company() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}
}
