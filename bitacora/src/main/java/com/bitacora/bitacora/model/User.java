package com.bitacora.bitacora.model;

import jakarta.persistence.Entity;

@Entity
public class User {
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

}
