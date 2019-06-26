/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutableclassexample;

/**
 *
 * @author pc
 */
public class ImmutableClassExample {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        immutableClass ic = new immutableClass(); // just accessed to name of person because 
        System.out.println(ic.getPerson1());      // immutableClass is immutable
        System.out.println(ic.getPerson2());      // all data fields must be private
        System.out.println(ic.getPerson3());      // there can't be any mutator methods for data fields.
        System.out.println(ic.getPerson4());      // no accessor methods can return a reference to a data field that is mutable
        
        
        
    }                                         
    
}
