import { Component } from '@angular/core';
import { Login } from './login.component';

@Component({
  selector: 'employeeMenu',
  templateUrl: './employee.html'
})
export class EmployeeMenu extends Login{
  title = 'project1';
  

}