package project06;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PersonTwo {
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();
    
    public void displayPersonInfo(){
        // Populate the name object
        name.append("Collins");
        name.append(" ");
        name.append("Muiruri");
        // Display the name and the capacity of the object
        System.out.println("Name: "+ name.toString());
        System.out.println("Name object capacity: " + name.capacity());
        
        // Populate the phoneNumber object
        phoneNumber.append("0717745332");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        System.out.println("Phone number: " + phoneNumber.toString());
	  
	  // Get and display the first name
        System.out.println("First Name: "+ name.substring(0, 8));
    }
}
