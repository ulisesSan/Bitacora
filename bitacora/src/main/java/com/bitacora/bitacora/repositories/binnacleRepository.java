package com.bitacora.bitacora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.bitacora.bitacora.model.binnacleModel;

import java.util.ArrayList;

public interface binnacleRepository extends JpaRepository<binnacleModel,String> {

    @Query(value = "Select * from bitacora where num_Emp = ?1", nativeQuery = true)
    ArrayList<binnacleModel> getBitacora(String num_Emp);
}
