package com.testpersonal.TestService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testpersonal.TestService.model.dto.UserDto;

@RestController
public class Controller {
	
	@GetMapping("/{path}")
	public ResponseEntity<String> getWithParams(
			@PathVariable String path,
			@RequestParam String request) {
		
		return ResponseEntity.ok(path.concat(" ").concat(request));
	}
	
	@GetMapping
	public ResponseEntity<UserDto> get() {
		return ResponseEntity.ok(new UserDto("daniel", "osorio"));
	}
	
	@PostMapping
	public String create() {
		return "post working";
	}
	
	@PutMapping("")
	public String update() {
		return "put working";
	}

	@DeleteMapping
	public String delete() {
		return "delete working";
	}
}
