package com.dd.army.constant.error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.dd.army.constant.enums.ResponseCodeEnum;
import com.dd.army.controller.response.ResponseBodyDto;

@RestControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public @ResponseBody ResponseEntity<ResponseBodyDto<Object>> handleServerError(Exception ex, WebRequest request) {
		// quá trình kiểm soat lỗi diễn ra ở đây
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ResponseBodyDto<Object> dtoResult = new ResponseBodyDto<>();
		dtoResult.setCode(ResponseCodeEnum.R_500);
		dtoResult.setMessage("Error unknown");
		System.out.println(ex);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(dtoResult);
	}
	
	@ExceptionHandler(NotFoundException.class)
	public @ResponseBody ResponseEntity<ResponseBodyDto<Object>> handleNotFoundException(Exception ex) {
		// quá trình kiểm soat lỗi diễn ra ở đây
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ResponseBodyDto<Object> dtoResult = new ResponseBodyDto<>();
		dtoResult.setCode(ResponseCodeEnum.R_404);
		dtoResult.setMessage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(headers).body(dtoResult);
	}
	
}
