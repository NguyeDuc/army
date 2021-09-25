package com.dd.army.service.impl;

import java.time.Instant;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dd.army.constant.error.NotFoundException;
import com.dd.army.controller.request.UserRequest;
import com.dd.army.dto.UserDto;
import com.dd.army.dto.mapper.GenericMapper;
import com.dd.army.model.User;
import com.dd.army.repository.UserRepository;
import com.dd.army.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private GenericMapper genericMapper;

	@Override
	public UserDto login(String username, String pass) {

		User user = userRepository.findByNameAndPass(username, pass);
		if (user == null) {
			throw new NotFoundException("Tài khoản hoặc mật khẩu không đúng");
		}
		final String uuid = UUID.randomUUID().toString().replace("-", "");
		user = userRepository.save(user.setToken(uuid).setLastLogin(Instant.now()));
		user.setPass(null);

		return genericMapper.mapToType(user, UserDto.class);
	}

	@Override
	public UserDto create(UserRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
