/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog5121.part1;
import java.util.Scanner;

/**
 *Main class for the chat App Part 1
 * 
 * This is a console-based application
 */
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Login user = new Login();
            Created the header section of the chat app
            System.out.println("==============================");
            System.out.println("      CHAT APP - PART 1     ");
            System.out.println("   REGISTRATION AND LOGIN   ");
            System.out.println("==============================");
            
            // Get the users first name
            System.out.print("Enter your first name:");
            String firstName = scanner.nextLine();
            
            // Get the users last name
            System.out.print("Enter your last name:");
            String lastName = scanner.nextLine();
            
            user.setFirstName(firstName);
            user.setLastName(lastName);
            
            //Registration
            System.out.println("\n========== REGISTRATION ==========");
            
            System.out.print("Enter a username:");
            String username = scanner.nextLine();
            
            user.setUsername(username);
            Added if statements for the different outcomes the user might get after entering information
            if (user.checkUserName()) {
                
                System.out.println("Username successfully captured.");
            } else {
                
                System.out.println(
                         "Username is not formatted correctly; "
                         + "please ensure that your username contains"
                         + "an underscore that is no more than five "
                         + "characters in length."
                );
            }
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            user.setPassword(password);
            
            if(user.checkPasswordComplexity()) {
                
                System.out.println("Password successfully captured");  
            } else {
                System.out.println(
                        "Password is not formatted correctly; "
                        +"please make sure that the passwords contains"
                        +"at least eight characters, a capital letter, "
                        +"a number, and a special character."
                );
            }
            System.out.print("Enter your South African cell phone number:");
            String cellPhoneNumber = scanner.nextLine();
            
            user.setCellPhoneNumber(cellPhoneNumber);
                
            if (user.checkCellPhoneNumber()) {
            System.out.println("Cell phone number successfully added.");
            } else {
                
                System.out.println(
                             "Cell phone number is formatted incorrectly "
                             + "or does not contain the correct international code; "
                             + "please correct the cell phone number and try again."
                );
            }
            
            //Check if all the registration requirements are met
            if (user.checkUserName()
                    && user.checkPasswordComplexity()
                    && user.checkCellPhoneNumber()) {
                
                System.out.println("\nRegistration successful!");
                
                //Login
                System.out.println("\n========== LOGIN ==========");
                
                System.out.print("Enter your username: ");
                String loginUsername = scanner.nextLine();
                
                System.out.print("Enter your password: ");
                String loginPassword = scanner.nextLine();
                
                boolean loginSuccessful =
                        user.loginUser(loginUsername, loginPassword);
                
                System.out.println(
                         user.returnLoginStatus(loginSuccessful)
                );
            } else {
                System.out.println(
                              "\nRegistration unsuccessful. "
                              + "Please correct the invalid information and try again."
                );
            }
            scanner.close();
    }
}
