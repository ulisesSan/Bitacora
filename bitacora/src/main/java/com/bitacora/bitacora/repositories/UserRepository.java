package com.bitacora.bitacora.repositories;

import com.bitacora.bitacora.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface UserRepository extends JpaRepository<usuario,String>{

    @Query(value = "select * from usuario;", nativeQuery=true)
    ArrayList<usuario> usuario();
    @Query(value = "Select * from usuario where num_Emp = ?1", nativeQuery = true)
    ArrayList<usuario> userNum_Emp(String num);

    @Query(value = "select bitacora.fun_initsesion(?1, ?2);", nativeQuery = true)
    String initSession(String num_Emp, String passwd);
}



