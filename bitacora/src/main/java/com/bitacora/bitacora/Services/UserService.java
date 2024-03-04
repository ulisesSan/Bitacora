package com.bitacora.bitacora.Services;


import com.bitacora.bitacora.model.usuarios;
import com.bitacora.bitacora.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository uRepo;

    public ArrayList<usuarios> getUsers(){
        ArrayList<usuarios> usuarios = uRepo.usuarios();
        return usuarios;
    }
}
