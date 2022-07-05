import { Component } from '@angular/core';
import { students } from './students';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title1 = 'Title 1';
  title2:string = 'CS258';

  mystudents = students;
}
