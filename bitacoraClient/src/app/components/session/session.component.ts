import { Component } from '@angular/core';
import { UsersService } from 'src/app/services/users.service';
import { ActivatedRoute, Router } from '@angular/router';
import { setCookie } from 'typescript-cookie'
import { BitacoraService } from 'src/app/services/bitacora.service';

@Component({
  selector: 'app-session',
  templateUrl: './session.component.html',
  styleUrls: ['./session.component.css']
})
export class SessionComponent {
  constructor(private userService: UsersService, private rutas: Router, private rutaActiva: ActivatedRoute,
    private bitacora: BitacoraService){}

  numEmp: string = "";
  passwd: string = "";

  ngOnInit(){

  }

  initUser(){
    this.userService.getInitUsers(this.numEmp,this.passwd).subscribe(
      res =>{
        if (res){
          setCookie('Init',this.numEmp,
          {
            expires: 1
          })
          this.rutas.navigate(['/bitacora'])
        }
        else{
          alert("Usuario o contraseña incorrectos");
          
        }
      },
      err => {
        console.log(err)
      }
    )
    console.log("Info agregada " +  this.numEmp + ' ' +  this.passwd)
  }
}
