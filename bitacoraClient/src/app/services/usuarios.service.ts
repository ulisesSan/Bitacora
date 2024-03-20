import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuarios } from '../interface/usuarios';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  constructor(private httpClient: HttpClient) { }

  API_URL : string = "http://localhost:8080";

  getUsers(): Observable<Usuarios>{
  return this.httpClient.get<Usuarios>(this.API_URL+"/users/getusers").pipe(res => res)
  }

  addUser(user: Usuarios):Observable<Usuarios>{
    return this.httpClient.post<Usuarios>(this.API_URL+"/users/addUser", user)
  }
}
