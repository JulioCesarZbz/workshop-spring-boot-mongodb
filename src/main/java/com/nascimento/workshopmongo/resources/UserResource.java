package com.nascimento.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nascimento.workshopmongo.domain.User;
import com.nascimento.workshopmongo.services.UserService;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET) //também é possivel usar o metodo @GetMapping, da no mesmo
	public ResponseEntity< List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
