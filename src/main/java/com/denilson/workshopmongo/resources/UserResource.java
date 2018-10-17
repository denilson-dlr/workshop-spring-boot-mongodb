package com.denilson.workshopmongo.resources;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.denilson.workshopmongo.domain.User;
import com.denilson.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
		
		//Codigo abaixo não possui conexao
    	//User maria = new User("1", "Maria Brown", "maria@gmail.com");
    	//User alex = new User("2", "Alex Green", "alex@gmail.com");
    	//List<User> list = new ArrayList<>();
    	//list.addAll(Arrays.asList(maria, alex));
    	//return ResponseEntity.ok().body(list);
		
    }
}
