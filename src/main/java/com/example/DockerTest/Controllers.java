package com.example.DockerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controllers {
	
	@GetMapping("/hey")
	public String getmsg() {
		return "Hey Abhijit";
	}

}
