package com.bitacora.bitacora.controllers;


import com.bitacora.bitacora.Services.UserService;
import com.bitacora.bitacora.model.usuario;
import com.bitacora.bitacora.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

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
    public ResponseEntity<ArrayList<usuario>> getUsers(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-type", "application/json","Accecss-Control-Allow-Origin: *")
                .body(uService.getUsers());
    }

    @PostMapping("/addUser")
    //@ResponseBody
    public usuario addUser(@RequestBody  usuario addUsuario){
            return uService.adduser(addUsuario);
    }
}
