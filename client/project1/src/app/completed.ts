import { Component } from '@angular/core';

import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Component({
  selector: 'Component',
  templateUrl: './completed.html'
})
export class Completed {
  title = 'Completed';
  username = '';
  empTicketAmount = '';
  constructor(private http:HttpClient, private router:Router) {}

  ngOnInit() {      
    this.http.post("http://localhost:8080/Project1/user", JSON.stringify({username:"jesse",employeeID:1}))
    .subscribe({
      next:(data:any)=>{

        this.username = data.username;
        this.empTicketAmount = data.empTickets[3].ticketAmount;
      },
      error:(error)=>{},
      complete:()=>{}
    })
  }
}