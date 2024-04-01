import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BitacoraService {

  API_URI = 'http://localhost:8080'

  constructor(private http:HttpClient) { }

  getBitacora(numEmp: string){
    return this.http.get(`${this.API_URI}/bitacora/getitacora?Num=${numEmp}`)
  }

}
