package com.dd.army.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dd.army.constant.enums.ResponseCodeEnum;
import com.dd.army.controller.request.LoginRequest;
import com.dd.army.controller.response.ResponseBodyDto;
import com.dd.army.dto.UserDto;
import com.dd.army.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

	@Autowired
	private UserService userSerivce;

	@PostMapping(value = "/login")
	public ResponseEntity<ResponseBodyDto<UserDto>> authenticateUser(@RequestBody LoginRequest loginRequest) {
		System.out.println("login");
		UserDto userDto = userSerivce.login(loginRequest.getUsername(), loginRequest.getPassword());
		ResponseBodyDto<UserDto> response = new ResponseBodyDto<UserDto>(userDto, ResponseCodeEnum.R_200, "OK");

		return new ResponseEntity<ResponseBodyDto<UserDto>>(response, HttpStatus.OK);
	}

}
