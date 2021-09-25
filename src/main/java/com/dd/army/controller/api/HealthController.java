package com.dd.army.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dd.army.constant.enums.ResponseCodeEnum;
import com.dd.army.controller.response.ResponseBodyDto;

@RestController
@RequestMapping("/health")
public class HealthController {
	@GetMapping(value = "/live", produces = "application/json")
	public ResponseEntity<Object> healthLive() {
		ResponseBodyDto<Object> dtoResult = new ResponseBodyDto<>();
		dtoResult.setCode(ResponseCodeEnum.R_200);
		dtoResult.setMessage("OK");
		return new ResponseEntity<Object>(dtoResult, HttpStatus.OK);
	}

	@GetMapping(value = "/ready", produces = "application/json")
	public ResponseEntity<Object> healthReady() {
		ResponseBodyDto<Object> dtoResult = new ResponseBodyDto<>();
		dtoResult.setCode(ResponseCodeEnum.R_200);
		dtoResult.setMessage("OK");
		return new ResponseEntity<Object>(dtoResult, HttpStatus.OK);
	}
}
