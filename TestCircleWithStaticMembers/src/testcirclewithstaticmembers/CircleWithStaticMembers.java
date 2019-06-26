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
public class CircleWithStaticMembers {
    
    double radius;
    
    static int numberOfObjects = 0;

    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    public CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    double getArea(){
        return radius * radius * Math.PI;
    }
    
    
    
    
    
}
