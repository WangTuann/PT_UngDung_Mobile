import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-account',
  templateUrl: './account.page.html',
  styleUrls: ['./account.page.scss'],
})
export class AccountPage implements OnInit {
  email: string = '1910152@dlu.edu.vn';
  cash: string = '100000';
  constructor() {}

  ngOnInit() {}
}
