package com.bitacora.bitacora.repositories;

import com.bitacora.bitacora.model.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;


public interface UserRepository extends JpaRepository<usuarios,String>{
    @Query(value = "select * from usuarios;", nativeQuery=true)
    ArrayList<usuarios> usuarios();
}



