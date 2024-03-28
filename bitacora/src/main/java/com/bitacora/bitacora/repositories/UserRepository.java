package com.bitacora.bitacora.repositories;

import com.bitacora.bitacora.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<usuario,String>{
    @Query(value = "select * from usuario;", nativeQuery=true)
    ArrayList<usuario> usuario();
}



