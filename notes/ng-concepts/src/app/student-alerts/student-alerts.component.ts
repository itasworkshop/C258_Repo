import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Student } from '../students';

@Component({
  selector: 'app-student-alerts',
  templateUrl: './student-alerts.component.html',
  styleUrls: ['./student-alerts.component.css']
})
export class StudentAlertsComponent implements OnInit {

  @Input() student!: Student;

  @Output() notify = new EventEmitter();


  constructor() { }

  ngOnInit(): void {
  }

}
