import { formatCurrency } from '@angular/common';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from './employee';
import { Observable,throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Router } from '@angular/router';

@Component({
    selector: 'login',
    templateUrl: './login.html'
  })

 
  export class Login {
    title = 'Login';
    
    constructor(private http:HttpClient, private router:Router) {}

    reqdata:any;
    username:string = "";

    onSubmit(form:NgForm) {      
      console.log(form);
      this.http.post("http://localhost:8080/Project1/user", JSON.stringify({username:form.value.username,employeeID:form.value.empid}))
      .subscribe({
        next:(data:any)=>{
          console.log(data);
          this.reqdata = data;
          this.username = data.username;
          localStorage.setItem("username", form.value.username);
          this.router.navigate(['/employee'])
        },
        error:(error)=>{
          console.log(error);
        },
        complete:()=>{}
      })
    }
  }