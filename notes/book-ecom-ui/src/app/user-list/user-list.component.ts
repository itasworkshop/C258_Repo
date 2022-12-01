import { Component, OnInit } from '@angular/core';
import { Book } from 'src/model/book';
import { BookService } from 'src/service/book.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users!: Book[];

  constructor(private userService: BookService) { }

  ngOnInit(): void {

    this.userService.findAll().subscribe(
      data => {
        console.log(data);
        this.users = data;
      });
  }

}
