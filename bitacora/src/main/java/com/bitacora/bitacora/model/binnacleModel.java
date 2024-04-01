package com.bitacora.bitacora.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class binnacleModel {

    private @Id String numEmp;
    private String diaSem;
    private String folio;
    private int idServ;
    private String fechIni;
    private String fechFin;
    private int timSol;
    private String estatus;
    private int timDev;
    private String descTarea;

    //Elemento Set

    public void setNumEmp(String numEmp){
        this.numEmp = numEmp;
    }
    public void setDiaSem(String diaSem){
        this.diaSem = diaSem;
    }

    public void setFolio(String Folio){
        this.folio = folio;
    }

    public void setIdServ(int idServ){
        this.idServ = idServ;
    }

    public void setFechIni(String fechini){
        this.fechIni = fechini;
    }

    public void setFechFin(String fechFin){
        this.fechFin = fechFin;
    }

    public void setTimSol(int timSol){
        this.timSol = timSol;
    }

    public void setEstatus(String estatus){
        this.estatus = estatus;
    }
    public void setTimDev(int timDev){
        this.timDev = timDev;
    }

    public void setDescTarea(String descTarea){
        this.descTarea = descTarea;
    }

    //Elementos get
    public String getNumEmp(){
        return this.numEmp;
    }

    public int getIdServ() {
        return idServ;
    }

    public int getTimDev() {
        return timDev;
    }

    public int getTimSol() {
        return timSol;
    }

    public String getDescTarea() {
        return descTarea;
    }

    public String getDiaSem() {
        return diaSem;
    }

    public String getEstatus() {
        return estatus;
    }

    public String getFechFin() {
        return fechFin;
    }

    public String getFechIni() {
        return fechIni;
    }

    public String getFolio() {
        return folio;
    }
    public binnacleModel(){}

    public binnacleModel(String numEmp, String diaSem, String folio,
                         int idServ, String fechIni, String fechFin,
                         int timSol, String estatus, int timDev,
                         String descTarea){}
}
