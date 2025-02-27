package com.rest.webservices.restful_web_services.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	private UserDaoService service;
	
	public UserResource (UserDaoService service) {
		this.service = service;
	}
	
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers() {
		return service.findAllUser();
	}
	
	@GetMapping(path = "/users/{id}")
	public User retrieveUsersById(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping(path = "/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User userSavedUser = service.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(userSavedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
}
