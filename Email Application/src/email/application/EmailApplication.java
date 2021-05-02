/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email.application;

/**
 *
 * @author lawve
 */
public class EmailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OpeningForm of = new OpeningForm();
        of.setVisible(true);
        of.setLocationRelativeTo(null);
        Email em1 = new Email("John", "Smith");
        
    }
    
}
