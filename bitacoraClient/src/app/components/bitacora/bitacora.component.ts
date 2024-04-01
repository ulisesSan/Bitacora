import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { getCookie } from 'typescript-cookie';
import { BitacoraService } from 'src/app/services/bitacora.service';

@Component({
  selector: 'app-bitacora',
  templateUrl: './bitacora.component.html',
  styleUrls: ['./bitacora.component.css']
})
export class BitacoraComponent {

  constructor(private bitacora: BitacoraService, private rutas: Router, private rutaActiva: ActivatedRoute){}

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
        console.log(res)
      }
    )
  }

}
