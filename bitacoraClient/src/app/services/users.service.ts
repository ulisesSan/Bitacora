import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { userInit } from '../Models/Usuario';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  API_URI = 'http://localhost:8080'

  constructor(private http : HttpClient) { }

  getInitUsers(userID: string, userPasswd: string){
    return this.http.get(`${this.API_URI}/users/getinit?Num=${userID}&Passwd=${userPasswd}`)
  }
}
