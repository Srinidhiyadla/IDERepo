package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Author;
import com.example.demo.Service.ManytoMnayService;

@RestController
public class ManytoManyController {

	@Autowired
	private ManytoMnayService manytoMnayService;
	
	@PostMapping("/AuthorDetails")
	public ResponseEntity<Author> saveDetails(@RequestBody Author author) {
	Author authorHistory = manytoMnayService.getsaveDetails(author);
		return new  ResponseEntity<Author>(authorHistory,HttpStatus.CREATED);
	}

	@GetMapping(value = "/getBookDetails")
	public ResponseEntity<List<Author>> AuthorDetails() {
		return new ResponseEntity<List<Author>>(manytoMnayService.getAuthorDetails(),HttpStatus.CREATED);
	}
	
}
