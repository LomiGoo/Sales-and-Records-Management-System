
package com.goat.project.system;

  import java.util.Scanner;
public class Simulation {
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

       
     String adminUser = "admin";
        String adminPass = "admin123";

        String[] cashierUsers = {"cashier1", "cashier2"};
        String[] cashierPass = {"cashier123", "cashier456"};

        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Username: ");
            String username = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            // ===== COLLECT ALL ERRORS =====
            String errorMessage = "";

            // username checks
            if (username.length() < 5) {
                errorMessage += "Username must be at least 5 characters.\n";
            }
            if (username.length() > 30) {
                errorMessage += "Username must not exceed 30 characters.\n";
            }

            // password checks
            if (password.length() < 5) {
                errorMessage += "Password must be at least 5 characters.\n";
            }
            if (password.length() > 30) {
                errorMessage += "Password must not exceed 30 characters.\n";
            }

            // if any error exists, show them and skip login check
            if (!errorMessage.isEmpty()) {
                System.out.println(errorMessage);
                attempts++;
                System.out.println("Attempts left: " + (3 - attempts));
                continue;
            }

            // ===== LOGIN CHECK =====

            // admin login
            if (username.equals(adminUser) && password.equals(adminPass)) {
                System.out.println("Admin login successful!");
                break;
            }

            // cashier login
            boolean userFound = false;
            boolean passCorrect = false;

            for (int i = 0; i < cashierUsers.length; i++) {
                if (username.equals(cashierUsers[i])) {
                    userFound = true;
                    if (password.equals(cashierPass[i])) {
                        passCorrect = true;
                    }
                    break;
                }
            }

            if (userFound && passCorrect) {
                System.out.println("Cashier login successful!");
                break;
            } else if (userFound) {
                System.out.println("Password is incorrect.");
            } else {
                System.out.println("Username is incorrect.");
            }

            attempts++;
            System.out.println("Attempts left: " + (3 - attempts));
        }

        if (attempts == 3) {
            System.out.println("Too many failed attempts. Program closed.");
        }

        input.close();
    }
}

        

    
