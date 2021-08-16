import { Component, Input, SimpleChanges } from '@angular/core';

import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
    selector: 'ticketHeader',
    templateUrl: './header.html'
  })
  export class TicketHeader {
    title = 'Ticket';
    
    reqdata = '';
    username = '';

  constructor(private http:HttpClient, private router:Router) {}

  ngOnInit() {      
    this.http.post("http://localhost:8080/Project1/user", JSON.stringify({username:"jesse",employeeID:1}))
    .subscribe({
      next:(data:any)=>{
        console.log(data);
        this.username = data.username;
      },
      error:(error)=>{},
      complete:()=>{}
    })
  }

    pconsole(g: any){
      console.log(g);
    }

  }