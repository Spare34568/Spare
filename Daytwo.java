import java.util.Scanner;
/**
 * Write a description of class Daytwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Daytwo
{
    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        int age;
        
        System.out.println("Create a username.");
        username = scan.nextLine();
        System.out.println("Create a password.");
        password = scan.nextLine();
        scan.nextLine();
        System.out.println("How old are you");
        age = scan.nextInt();
        if(age >= 13){
            scan.nextLine();
            
            boolean usernameIn = false;
            boolean passwordIn = false;
            while(!usernameIn){
            System.out.println("Please input your username.");
            if(scan.nextLine().equals(username)){
                usernameIn = true;
                System.out.println("Press enter.");
                scan.nextLine();
                while(!passwordIn){
                System.out.println("Please input your password.");
                if(scan.nextLine().equals(password)){
                System.out.println("You are logged in.");
                passwordIn = true;}
                else{
                System.out.println("Incorrect username");
            }
            }
            
        }    
            } else{
            System.out.println("You are to young.");
        }
        }
    }      
