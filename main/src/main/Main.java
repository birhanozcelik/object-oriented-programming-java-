/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        triangle tri = new triangle();
        System.out.println("with main constructor, perimeter : " +tri.getPerimeter() + " area: " +tri.getArea());
        System.out.println(triangle.numberOfObjects);
        triangle tri1 = new triangle(7,8,9,6);
        System.out.println("with second constructor, perimeter : " +tri1.getPerimeter() + " area: " + tri1.getArea());
        System.out.println(triangle.numberOfObjects);
        rectangle rec = new rectangle();
        System.out.println("area of rectangle : " +rec.getArea());
        System.out.println("perimeter of rectangle : " +rec.getPerimeter());
        rec.setEdge2(-1.5);
        System.out.println("area of rectangle with setEdge2 : -1.5  : " +rec.getArea());
        System.out.println("perimeter of rectangle with setEdge2 : -1.5  : " +rec.getPerimeter());
        rectangle rec1 = new rectangle(2.7, 2.5);
        System.out.println("area of rectangle with rec1 : " +rec1.getArea());
        System.out.println("perimeter of rectangle with rec1 : " +rec1.getPerimeter());
        
        
    }
    
}
