package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Author;
import com.example.demo.Repositrory.AuthorRepo;

@Service
public class ManytoMnayService {

	@Autowired
	private AuthorRepo authorRepo;

	public Author getsaveDetails(Author author) {
		return authorRepo.save(author);
	}

	public List<Author> getAuthorDetails() {
		return  (List<Author>) authorRepo.findAll();
	}
}
