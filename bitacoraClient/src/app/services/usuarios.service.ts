import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  constructor(private httpClient: HttpClient) { }

  API_URL : string = "http://localhost:4200";

  getUsers(): Observable<any>{
  return this.httpClient.get(this.API_URL).pipe(res => res)
  }
}