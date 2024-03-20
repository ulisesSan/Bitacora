import { Component } from '@angular/core';
import { Usuarios } from '../../interface/usuarios';
import { UsuariosService } from '../../services/usuarios.service';

@Component({
  selector: 'app-add-usuario',
  standalone: true,
  imports: [],
  templateUrl: './add-usuario.component.html',
  styleUrl: './add-usuario.component.css'
})
export class AddUsuarioComponent {

  usuarioData: any = []

  constructor (private usuarioService: UsuariosService){
  
  }

  ngOnInit(){}

  addUser(){
    this.usuarioService.addUser(this.usuarioData)
    .subscribe(
      res =>{
        console.log(res)
      },
      err => console.error(err)

    )
  }
}
