package com.dd.army.service;

import com.dd.army.controller.request.UserRequest;
import com.dd.army.dto.UserDto;

public interface UserService {

	UserDto login(String username, String pass);
	
	UserDto create(UserRequest request);
}
