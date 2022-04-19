/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

import java.util.Scanner;

/**
 *
 * @author qngtuann
 */
public class ATM {
    
    public static void main(String[] args) {
        View view = new View();
        Controller control = new Controller();
        Model model = new Model();

        model.start();
        view.start();

        // loop until user exist
        boolean repeat = true;
        while (repeat) {
            int action = view.menu();
            String[] data = null;
            if (action == 1)
                data = view.loginForm();
            String message = control.process(model, action, data);
            repeat = view.display(message);
        }
    }
}

 class Account {
    private String id;
    private String pw;

    public Account(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public boolean checkLogin(String id, String pw) {
        // Kiem tra login voi tai khoan nay
        return id.equals(this.id) && pw.equals(this.pw);
    }
}
class Controller {
      String process(Model model, int action, String[] data) {

        String message;
        switch (action) {
        case 1:
            // Goi ham login in Model
            String id = data[0];
            String pw = data[1];
            boolean ok = model.login(id, pw);
            message = (ok) ? "Login is ok" : "Login fail";
            break;
        default:
            message = "Invalid operation";
            break;
        }
        return message;
    }
}
class Model {
    
  Account acc;

    void start() {
        // Tạo tài khoản mặc định
        acc = new Account("tuan", "123");
    }

    boolean login(String id, String pw) {
        return acc.checkLogin(id, pw);
    }
}
class View {
       Scanner sc;

    void start() {
        sc = new Scanner(System.in);
        System.out.println("===== Welcome to ATM Application =====");
    }

    // Menu input
    int menu() {
        System.out.println();
        System.out.println("-------- ATM Application --------");
        System.out.println("1 - Login");
        System.out.println("---------------------------------");
        System.out.print("Select your action: ");
        int action = sc.nextInt();
        return action;
    }

    // Yeu cau nguoi dung nhap ID va PW
    String[] loginForm() {

        System.out.print("Enter your ID: ");
        String id = sc.next();
        System.out.print("Enter your password: ");
        String pw = sc.next();
        // save and return
        String[] data = { id, pw };
        return data;
    }

    // Yeu cau nguoi dung nhap ID va PW
    boolean display(String message) {

        System.out.println();
        System.out.println("Result: " + message);
        System.out.println();
        // yeu cau cong viec
        System.out.print("Continue? (y/n)");
        String choice = sc.next();
        System.out.println();

        if (choice.equalsIgnoreCase("y"))
            return true;

        System.out.println("Goodbye!");
        return false;
    }
}


