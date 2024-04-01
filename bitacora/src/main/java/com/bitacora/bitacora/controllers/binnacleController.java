package com.bitacora.bitacora.controllers;

import com.bitacora.bitacora.model.binnacleModel;
import org.springframework.beans.factory.annotation.Autowired;
import com.bitacora.bitacora.repositories.binnacleRepository;
import com.bitacora.bitacora.Services.binnacleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bitacora")
public class binnacleController {
    Logger log = Logger.getLogger(UserController.class.getName());
    @Autowired
    binnacleRepository bitRepo;
    //@Autowired
    //binnacleService bitService;
    @GetMapping(value = "/getbitacora")
    public ResponseEntity<ArrayList<binnacleModel>> getBitacora(@RequestParam(value = "Num") String Num){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-type", "application/json","Accecss-Control-Allow-Origin: *")
                .body(bitRepo.getBitacora(Num));
    }

}
