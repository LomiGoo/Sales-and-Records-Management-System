
package com.goat.project.system;

  import java.util.Scanner;
public class Simulation {
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

        String adminUser = "admin";
        String adminPass = "1234";

        String[] cashierUsers = {"cashier1", "cashier2"};
        String[] cashierPass = {"pass1", "pass2"};

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            // ADMIN LOGIN
            if (username.equals(adminUser) && password.equals(adminPass)) {
                System.out.println("You are in admin interface!");
                input.close();
                return;
            }

            // CASHIER LOGIN
            boolean cashierFound = false;

            for (int i = 0; i < cashierUsers.length; i++) {
                if (username.equals(cashierUsers[i]) && password.equals(cashierPass[i])) {
                    System.out.println("You are in cashier interface!");
                    input.close();
                    return;
                }
                if (username.equals(cashierUsers[i])) {
                    cashierFound = true;
                }
            }

            // ERROR MESSAGES
            if (username.equals(adminUser)) {
                System.out.println("Password is incorrect.");
            } 
            else if (cashierFound) {
                System.out.println("Password is incorrect.");
            } 
            else {
                System.out.println("Username is incorrect.");
            }

            attempts++;
            System.out.println("Attempts left: " + (3 - attempts));
        }

        System.out.println("Too many failed attempts. Program closed.");
        input.close();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
