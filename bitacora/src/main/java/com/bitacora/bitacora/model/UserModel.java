package com.bitacora.bitacora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel {
    @Id
    private String empNum;
    private String nombre;
    private String apellidos;

    //Elementos set
    public void setEmpNum(String empNum){
        this.empNum = empNum;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    //Elementos get

    public String getEmpNum(){
        return this.empNum;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public UserModel(){

    }
}
