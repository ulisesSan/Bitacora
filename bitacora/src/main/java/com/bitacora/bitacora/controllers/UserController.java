package com.bitacora.bitacora.controllers;


import com.bitacora.bitacora.Services.UserService;
import com.bitacora.bitacora.model.usuarios;
import com.bitacora.bitacora.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository uRepo;
    @Autowired
    UserService uService;

    @GetMapping("/getusers")
    public ResponseEntity<ArrayList<usuarios>> getUsers(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-type", "application/json","Accecss-Control-Allow-Origin: *")
                .body(uService.getUsers());
    }
}
