package com.bitacora.bitacora.Services;


import com.bitacora.bitacora.model.usuario;
import com.bitacora.bitacora.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository uRepo;

    public ArrayList<usuario> getUsers(){
        ArrayList<usuario> usuarios = uRepo.usuario();
        return usuarios;
    }

    public usuario adduser(usuario user){
        return uRepo.save(user);
    }
}
