import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table'
 
import { SessionComponent } from './components/session/session.component';
import { BitacoraComponent } from './components/bitacora/bitacora.component';
import { UsersService } from './services/users.service';


@NgModule({
  declarations: [
    AppComponent,
    SessionComponent,
    BitacoraComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    CommonModule,
    TableModule
  ],
  providers: [
    UsersService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
