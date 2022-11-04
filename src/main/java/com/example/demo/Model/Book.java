package com.example.demo.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Book_History")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_id")
	private int id;
	@Column(name = "Book_name")
	private String name;
	@Column(name = "Book_PgCount")
	private int pageCount;
	
@JsonIgnoreProperties("book")
	@ManyToMany(mappedBy = "book")
	private List<Author> author;


	public Book() {
		super();
	}


	public Book(int id, String name, int pageCount, List<Author> author) {
		super();
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.author = author;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPageCount() {
		return pageCount;
	}


	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}


	public List<Author> getAuthor() {
		return author;
	}


	public void setAuthor(List<Author> author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pageCount=" + pageCount + ", author=" + author + "]";
	}

	
}
