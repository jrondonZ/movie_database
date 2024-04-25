
import java.util.Scanner;
import java.io.File;
import java.io.*;
public class loginSystem {
    
    //Starting up log in system
    public void User() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter username"); 

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please enter your key #"); 
        String user = scan.nextLine();
        String pass = scan.nextLine();

        String inpUser = keyboard.nextLine();
        String inpPass = keyboard.nextLine();
        
        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print("Welcome" + inpUser);
            System.out.print("Your credentials are wrong! Try again");
        }
    }
    
    public static CustomerNode start() {
        
        BST customers = Deserialize.desCustomers();
        
        Scanner scan = new Scanner(System.in);
            System.out.println("Please enter username"); 
            String inpUser= scan.nextLine();
            

            System.out.println("Please enter your key #"); 
            int inpPass = scan.nextInt();


            if (inpUser.equals(customers.search(inpPass).getName())) {
                System.out.println("Succesfully logged in as " + inpUser + "!");
                System.out.println();

                return customers.search(inpPass);


            } else {
                System.out.println("Your credentials didn't match our data base, please try again");
                return null;
            }
        }
    }