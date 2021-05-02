package email.application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lawve
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    
    // Constructor to recieve the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        
        
        // Call a method asking for the department - return the department
    }
    
    // Create email method that takes in user input (first name, 
    // last name, department, and company.
    // sets the users credentials to what was input.
    // Ask for the department
    private String setDepartment() {
     
        return null; 
    }
    
    // Create a generate random string for a password method
    // use the random class
    
    // Create setter methods that will change the password, set the 
    // mailbox capacity, and define an alternate email address.
    
    // Create getter methods that will be responsible for displaying the 
    // name, email, and mailbox capacity. 
    
    // Change the password
}
