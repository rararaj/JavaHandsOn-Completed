package com.texasmutual.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.texasmutual.user.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}