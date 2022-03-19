package com.springrest.springrest.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.User;

@Service
public class UserService {
	
	
	private List <User> basicDetail = new ArrayList<User>(
		Arrays.asList(
			new User("Hisar", "mahak","female"),
			new User("Delhi","ritik","male")
		)
	);

public List<User> getList()
{
	return basicDetail;
}

public User getDataById(String id) {
	User mylist = null;
	mylist = basicDetail.stream().filter(ob ->ob.getId().equals(id)).findFirst().get();
	return mylist;
	
}

public void addName (User user) {
	basicDetail.add(user);
	
}
}
		
	
	
	
	

	
	
	
		
	


