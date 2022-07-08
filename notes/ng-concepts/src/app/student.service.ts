import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './students';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  
  private studentsUrl = 'api/students';  // URL to web api

  //DI in nagular
  constructor(
      private http: HttpClient) 
  { }

  ngOnInit(){
    this.getStudents();
  }

  getStudents (): Observable<Student[]> {
    return this.http.get<Student[]>(this.studentsUrl);
  }
}

