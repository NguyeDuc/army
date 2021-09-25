package com.dd.army.controller.response;

import java.util.List;

import com.dd.army.constant.enums.ResponseCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ResponseBodyDto<E> {
	
	/**
	 * Reset API: Response code
	 */
	private ResponseCode code;

	/**
	 * Reset API: Response message
	 */
	private String message;

	/**
	 * Reset API: Response total items for pagination
	 */

	@JsonProperty("total_items")
	private long totalItems;

	/**
	 * Reset API: Response page number for pagination
	 */
	private int page;

	/**
	 * Reset API: Response size of one page for pagination
	 */
	private int size;

	/**
	 * Reset API: Response data of 1 item
	 */
	private E item;

	/**
	 * Reset API: Response data of list items
	 */
	private List<E> items;

	public ResponseBodyDto(E item,ResponseCode code,String message){
		this.code=code;
		this.message=message;
		this.item=item;
	}
}
