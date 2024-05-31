package com.bikalp.blog.services;

import java.util.List;

import com.bikalp.blog.entities.User;
import com.bikalp.blog.payloads.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	UserDto createUser(UserDto userDto);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);

}
