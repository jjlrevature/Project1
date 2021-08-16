import { Component } from '@angular/core';

import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'landing',
  templateUrl: './landing.html'
})
export class Landing {
  title = 'project1';
  
  // constructor(private http:HttpClient, private router:Router) {}

  // ngOnInit() {      
  //   this.http.post("http://localhost:8080/Project1/user", JSON.stringify({username:"jesse",employeeID:1}))
  //   .subscribe({
  //     next:(data:any)=>{
  //       console.log(data);
  //       this.router.navigate(['/employee'])
  //     },
  //     error:(error)=>{},
  //     complete:()=>{}
  //   })
  // }
}