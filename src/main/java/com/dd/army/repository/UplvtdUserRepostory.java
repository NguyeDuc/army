package com.dd.army.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dd.army.model.UplvtdUser;

@Repository
public interface UplvtdUserRepostory extends JpaRepository<UplvtdUser, Integer>{

}
