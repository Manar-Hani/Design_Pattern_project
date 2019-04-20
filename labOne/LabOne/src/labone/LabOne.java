/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labone;

/**
 *
 * @author Manar
 */
public class LabOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       RubberDuck rubberduck = new RubberDuck();
       rubberduck.performFly();
       rubberduck.performQuack();
       rubberduck.swim();
       rubberduck.display();
        displayDuck(rubberduck);
}
    
    public static void displayDuck(Duck duck){
        duck.performFly();
        duck.display();
    }
}