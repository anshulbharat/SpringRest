package com.springrest.springrest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	
	@GetMapping("/")
	public List<Book> getAllBook()
	{
		return Arrays.asList(
				new Book(1, "Once in a life", "Ballen de bol"));
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome user<h1>");
	}
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome admin<h1>");
	}
}
