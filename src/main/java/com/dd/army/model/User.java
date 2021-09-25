package com.dd.army.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name = "[user]")
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
	
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name", unique = true)
    private String name;
    
    @Column(name = "pass")
    private String pass;
    
    @Column(name = "token")
    private String token;
    
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "balance")
    private Integer balance;
    
    @Column(name = "last_login")
    private Instant lastLogin;
    

    
}
