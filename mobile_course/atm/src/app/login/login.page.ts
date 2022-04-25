import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  constructor(private router: Router) {}
  email: string = '';
  password: string = '';
  cash: string = '100000';

  ngOnInit() {}
  onSubmit() {
    if (this.email == '' || this.password == '') {
      alert('Vui lòng nhập email và mật khẩu');
    } else {
      if (this.email == '1234' && this.password == '1234') {
        alert('ĐĂNG NHẬP THÀNH CÔNG');
        this.router.navigateByUrl('/home');
      } else {
        alert('Sai tên đăng nhập hoặc mật khẩu! Vui lòng đăng nhập lại!');
      }
    }
  }
}
