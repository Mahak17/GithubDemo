package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.UserService;

@RestController
public class UserController {
	@Autowired
private	UserService userService;		
		
	@GetMapping ("/user")
	public List<User> geAllList(){
		return this.userService.getList();
		
	}
	
	//retrieves a specific user detail
	
	@GetMapping("single-list/{id}")
	public User getDetailById(@PathVariable String id) {
		return this.userService.getDataById(id);
	}
	@GetMapping ("/test")
	public User mytest() {
		User u = new User();
		u.setName("veena");
		u.setId("Roorkee");
		u.setGender("female");
		return u;
	}
	@PostMapping("/add")
	public User addData(@RequestBody User user) {
		this.userService.addName(user);
		return user;
		
	}
@DeleteMapping("delete/{userId})")
public void deleteData(@PathVariable("userId") String id) {
	System.out.println(id);
}	
	@PutMapping("update/{id}")
	public User updateRecord(@RequestBody User user,@PathVariable String id) {
		System.out.println (id);
		return user;
	}

}
