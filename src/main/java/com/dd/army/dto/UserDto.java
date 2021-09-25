package com.dd.army.dto;

import java.time.Instant;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserDto {
	

    private Integer id;
    
    private String name;

    private String token;
    
    private String phoneNumber;

    private Integer balance;
    
    private Instant lastLogin;
    
    
}
