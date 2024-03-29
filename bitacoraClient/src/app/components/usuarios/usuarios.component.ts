import { Component, OnInit } from '@angular/core';
import { UsuariosService } from '../../services/usuarios.service';
import { Usuarios } from '../../interface/usuarios';
import { CommonModule } from '@angular/common';
import { AddUsuarioComponent } from '../add-usuario/add-usuario.component';

@Component({
  selector: 'app-usuarios',
  standalone: true,
  imports: [CommonModule,AddUsuarioComponent],
  templateUrl: './usuarios.component.html',
  styleUrl: './usuarios.component.css'
})
export class UsuariosComponent {

  Usuarios: any = [];

  constructor(private usuariosService : UsuariosService){}
  ngOnInit(): void {
      this.getUsuarios()
  }

  getUsuarios(){
    this.usuariosService.getUsers().subscribe({
      next: (result) => {
        this.Usuarios = result
        console.log(result)
      },
      error: (err)=>{
        console.log(err)
      } 
    })

}}
