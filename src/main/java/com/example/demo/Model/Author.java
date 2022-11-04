package com.example.demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Author_History")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "Author_Id")
	private int id;
	@Column(name = "Author_Name")
	private String name;
	@Column(name = "Author_Age")
	private int age;
	
	@JsonIgnoreProperties("author")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Author_Book",referencedColumnName = "Book_id")
	private List<Book> book;


	public Author() {
		super();
	}


	public Author(int id, String name, int age, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.book = book;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Book> getBook() {
		return book;
	}


	public void setBook(List<Book> book) {
		this.book = book;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", age=" + age + ", book=" + book + "]";
	}
	
	
	
}
