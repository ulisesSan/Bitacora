import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { UsuariosComponent } from './components/usuarios/usuarios.component';
import { AddUsuarioComponent } from './components/add-usuario/add-usuario.component';
export const routes: Routes = [
        { path: 'usuarios', component: UsuariosComponent },
        { path: 'addUsuarios', component: AddUsuarioComponent}
];

