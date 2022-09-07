package com.BikkadIT.UserManagementApplication.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApplication.entities.UserAcccountEntity;
@Repository
public interface UserAccountRepository extends JpaRepository<UserAcccountEntity, Serializable> {

	public UserAcccountEntity findByEmailAndPassword(String email,String password);
}
