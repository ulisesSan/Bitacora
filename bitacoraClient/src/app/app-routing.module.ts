import { NgModule,Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BitacoraComponent } from './components/bitacora/bitacora.component';
import { SessionComponent } from './components/session/session.component';


const routes: Routes = [
  {
    path:'session',
    component: SessionComponent
  },
  {
    path:"bitacora",
    component: BitacoraComponent
  },
  {
    path:'**',
    redirectTo: 'session',
    pathMatch: "full"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
