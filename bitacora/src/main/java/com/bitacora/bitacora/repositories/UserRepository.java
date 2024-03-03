package com.bitacora.bitacora.repositories;

import com.bitacora.bitacora.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserModel,String>{}
