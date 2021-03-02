package com.texasmutual.employeems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.texasmutual.employeems.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}