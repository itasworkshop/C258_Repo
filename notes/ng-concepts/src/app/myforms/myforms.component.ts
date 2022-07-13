import { Component, OnInit } from '@angular/core';
import { StudentAlertsComponent } from '../student-alerts/student-alerts.component';
import { User } from '../students';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-myforms',
  templateUrl: './myforms.component.html',
  styleUrls: ['./myforms.component.css']
})
export class MyformsComponent implements OnInit {

  model: User = new User(101,"Tom");

  constructor() { }

  get diagnostic(){
    return JSON.stringify(this.model);
  }

  ngOnInit(): void {
  }

  newUser(){
    this.model = new User(111,"");
  }

  onSubmit(f: any){
    console.log(JSON.stringify(f.value));
  }

}
