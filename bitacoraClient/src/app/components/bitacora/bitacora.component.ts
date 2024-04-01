import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { getCookie } from 'typescript-cookie';
import { BitacoraService } from 'src/app/services/bitacora.service';
import { Bitacora } from '../../Models/Bitacora';

@Component({
  selector: 'app-bitacora',
  templateUrl: './bitacora.component.html',
  styleUrls: ['./bitacora.component.css']
})
export class BitacoraComponent {

  constructor(private bitacora: BitacoraService, private rutas: Router, private rutaActiva: ActivatedRoute){}

  infoBitacora: any = []

  diaSem: any ={
    1: "Lunes",
    2: "Martes",
    3: "Miercoles",
    4: "Jueves",
    5: "Viernes"
  }

  ngOnInit(){
    if((getCookie('Init'))==null)
      this.rutas.navigate(['/session'])
    this.getBitacora(getCookie('Init'))
  }

  getBitacora(numEmp: any){
    var params = this.rutaActiva.snapshot.params
    console.log(numEmp)
    this.bitacora.getBitacora(numEmp).subscribe(
      res =>{
        this.infoBitacora = res
        for(const item of this.infoBitacora){
          if(!this.infoBitacora){
            this.infoBitacora.diaSem[item] = this.diaSem[this.infoBitacora[item].diaSem]
          }
        }
        console.log(this.diaSem)
        console.log(this.infoBitacora)
      }
    )
  }

}
