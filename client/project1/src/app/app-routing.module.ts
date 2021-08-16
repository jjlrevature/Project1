import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Completed } from './completed';
import { Denied } from './denied.component';
import { EmployeeMenu } from './employeeMenu.component';
import { Landing } from './landing.component';
import { ManagerMenu } from './managerMenu.component';
import { Pending } from './pending';
import { NewTicket } from './ticket.component';
import { UserMenu } from './user.component';
import { TicketHeader } from './header.component';
import { Login } from './login.component';
const routes: Routes = [
  { path: '', component: UserMenu},
  { path: 'employee', component: EmployeeMenu,
    children: [     
      { path: '', component: Landing}, 
      { path: 'newticket', component: NewTicket},
      { path: 'denied', component: Denied},
      { path: 'pending', component: Pending},
      { path: 'completed', component: Completed},
    ]
  },
  { path: 'manager', component: ManagerMenu},
  { path: 'user', component: UserMenu}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [Landing, NewTicket, Denied, Pending, Completed, EmployeeMenu, ManagerMenu, UserMenu, TicketHeader,
Login];