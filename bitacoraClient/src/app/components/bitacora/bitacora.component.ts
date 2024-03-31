import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { getCookie } from 'typescript-cookie';

@Component({
  selector: 'app-bitacora',
  templateUrl: './bitacora.component.html',
  styleUrls: ['./bitacora.component.css']
})
export class BitacoraComponent {

  constructor( private rutas: Router, private rutaActiva: ActivatedRoute){}

  ngOnInit(){
    if(getCookie('Init')!='1')
      this.rutas.navigate(['/session'])
  }

}
