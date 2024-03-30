import { Component } from '@angular/core';
import { UsersService } from 'src/app/services/users.service';
import { userInit } from 'src/app/Models/Usuario';


@Component({
  selector: 'app-session',
  templateUrl: './session.component.html',
  styleUrls: ['./session.component.css']
})
export class SessionComponent {
  constructor(private userService: UsersService){}

  user = {
    numEmp: '14',
    passwd: '14'} as userInit;

  ngOnInit(){
    
  }
}
