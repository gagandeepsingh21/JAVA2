/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initials;

/**
 *
 * @author gagandeep gahir
 */
import java.util.Scanner;
public class Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fname,mname,lname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        fname=sc.nextLine();
        System.out.println("Enter your middlename: ");
        mname=sc.nextLine();
        System.out.println("Enter your lastname: ");
        lname=sc.nextLine();
        
        String initial= fname.substring(0, 1) + "." + mname.substring(0, 1)+ "." + lname.substring(0, 1);
        
        System.out.println(initial);
    }
    
}
