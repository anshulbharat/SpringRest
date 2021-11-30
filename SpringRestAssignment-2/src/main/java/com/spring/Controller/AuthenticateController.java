package com.spring.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {
	
	
		
		@RequestMapping("/authenticate/{username}/{password}")
		public String getMessage(@PathVariable("username") String username, @PathVariable("password") String password) {
			String existingUser = "anshul@mail.com";
			String piyuPass = "anshul@123";
			
			if(username.equals(existingUser) && password.equals(piyuPass)) {
				return "Valid User";
			} else {
				return "Invalid User";
			}
		}
	}


