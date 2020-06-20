package com.learn.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.example.entity.EmployeeAccount;

@Repository
public interface EmployeeAccountRepository extends JpaRepository<EmployeeAccount, Long> {
}