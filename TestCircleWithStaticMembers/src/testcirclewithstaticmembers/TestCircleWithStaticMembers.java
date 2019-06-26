/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcirclewithstaticmembers;

/**
 *
 * @author pc
 */
public class TestCircleWithStaticMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("before creating objects");
        System.out.println("the number of circle objects is : " +CircleWithStaticMembers.numberOfObjects);
        
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius(" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        
        c1.radius = 9;
        
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" +c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" +c2.numberOfObjects + ")");
        
    }
    
}
