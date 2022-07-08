import { Component, Input, OnInit } from '@angular/core';
import { Student } from '../students';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  @Input() student!: Student;
  
  constructor() { }

  ngOnInit(): void {
  }

}
