package com.bitacora.bitacora.controllers;


import com.bitacora.bitacora.Services.UserService;
import com.bitacora.bitacora.model.usuario;
import com.bitacora.bitacora.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.logging.Logger;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {
    Logger log = Logger.getLogger(UserController.class.getName());
    @Autowired
    UserRepository uRepo;
    @Autowired
    UserService uService;

    @GetMapping(value = "/getusers")
    public ResponseEntity<ArrayList<usuario>> getUsers(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-type", "application/json","Accecss-Control-Allow-Origin: *")
                .body(uRepo.usuario());
    }

    @GetMapping(value = "/getinit")
    public ResponseEntity<String> initSeesion(@RequestParam(value = "Num") String Num, @RequestParam(value = "Passwd") String Passwd){
        log.info("LLega " + Num);
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-type", "application/json","Accecss-Control-Allow-Origin: *")
                .body(uRepo.initSession(Num, Passwd));
    }



    @PostMapping(value = "/addUser")
    //@ResponseBody
    public usuario addUser(@RequestBody  usuario addUsuario){
            return uService.adduser(addUsuario);
    }




}
