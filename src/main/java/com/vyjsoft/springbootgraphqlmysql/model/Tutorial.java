package com.vyjsoft.springbootgraphqlmysql.model;

import javax.persistence.*;

@Entity
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "author_id", nullable = false, updatable = false)
	private Author author;

	public Tutorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutorial(String title, String description, Author author) {
		super();
		this.title = title;
		this.description = description;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	 
	
}
