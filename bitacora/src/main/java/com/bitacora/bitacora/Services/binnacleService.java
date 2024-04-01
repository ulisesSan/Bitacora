package com.bitacora.bitacora.Services;

import com.bitacora.bitacora.repositories.binnacleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.bitacora.bitacora.model.binnacleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class binnacleService {
    @Autowired
    binnacleRepository bitRepo;
    public ArrayList<binnacleModel> getBinnacle(String Num){
        ArrayList<binnacleModel> binnacle = bitRepo.getBitacora(Num);
        return binnacle;
    }
}
