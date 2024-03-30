import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SessionComponent } from './components/session/session.component';
import { BitacoraComponent } from './components/bitacora/bitacora.component';


const routes: Routes = [
  {
    path:'',
    redirectTo:'session',
    pathMatch: 'full'
  },
  {
    path:"bitacora",
    component: BitacoraComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
