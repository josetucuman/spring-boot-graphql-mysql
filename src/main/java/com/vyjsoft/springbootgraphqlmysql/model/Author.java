package com.vyjsoft.springbootgraphqlmysql.model;

import javax.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="age")
	private Integer age;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(Long id) {
		this.id = id;
	}

	public Author( String name, Integer age) {
		super();
		 
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
