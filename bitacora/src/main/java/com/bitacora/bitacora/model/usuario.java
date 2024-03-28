package com.bitacora.bitacora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class usuario {

    private @Id String numEmp;
    private String nombre;
    private String apellidos;
    private String passwd;

    //Elementos set
    public void setEmpNum(String empNum){
        this.numEmp = empNum;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setPasswd(String pass){ this.passwd = pass; }

    //Elementos get

    public String getEmpNum(){
        return this.numEmp;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public String getPasswd(){ return this.passwd; }
    public usuario(){}

    public usuario(String numEmp, String nombre, String apellidos, String passwd){}
}
