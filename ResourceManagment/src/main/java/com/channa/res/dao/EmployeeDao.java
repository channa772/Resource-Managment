package com.channa.res.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.channa.res.entity.EmployeeEntity;

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {

}
