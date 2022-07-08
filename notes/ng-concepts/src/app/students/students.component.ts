import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { Student, students } from '../students';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  //mystudents = students;

  mystudents!: Student[];

  selectedStudent!: Student;

  constructor(private studentService: StudentService) { }

  ngOnInit(){
    this.getStudents();
  }

  onSelect(student:Student):void{
    this.selectedStudent = student;
  }

  getStudents():void{
    this.studentService.getStudents().subscribe(students => this.mystudents= students )
  }

}
