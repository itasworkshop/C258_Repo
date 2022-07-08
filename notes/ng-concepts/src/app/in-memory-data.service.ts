import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
	const students = [
    {
        id:101,
        name:'Rajesh',
        contact: 12345,
        intro: 'This is Rajest, i am a good student!',
        subject: ['cs','ec','it']
    },
    {
        id:102,
        name:'Tom',
        contact: 12345,
        intro: 'This is Tom, i am a good student!',
        subject: ['cs','ec','it']
    },
    {
        id:103,
        name:'Harry',
        contact: 12345,
        intro: 'This is Harry, i am a good student!',
        subject: ['cs','it']
    }
  ];
	return {students};
  }
}
