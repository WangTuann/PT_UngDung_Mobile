import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit {
  email: string = '1910152@dlu.edu.vn';
  constructor(private router: Router) {}
  openDetail() {
    this.router.navigateByUrl('/account');
  }

  openCamera() {
    this.router.navigateByUrl('/camera');
  }
  ngOnInit() {}
}
