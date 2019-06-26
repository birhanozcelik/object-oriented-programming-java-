/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2jpchapter9exercise9point9;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class I2jpChapter9exercise9point9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("please enter the n: ");
        int n = scn.nextInt();
        System.out.println("please enter the length of side : " );
        double side = scn.nextDouble();
        System.out.println("enter x coordinate: ");
        double x = scn.nextDouble();
        System.out.println("enter y coordinate : ");
        double y = scn.nextDouble();
        
        if(n == 0 && side == 0 && x == 0 && y == 0){
            RegularPolygon rp = new RegularPolygon(); // by default constructor
            System.out.println("area of regular polygon by default constructor : " + rp.getArea());
            System.out.println("perimeter of regular polygon by default constructor : " + rp.getPerimeter());
        }
        else{
            if(n < 3 || side < 0)
                System.out.println("n cannot be a negative number or less than 2 and side cannot be negative number!! Please set number..");
            else{
                RegularPolygon rp1 = new RegularPolygon(n, side, x, y); // by specified constructor
                System.out.println("area of regular polygon by specified constructor : " + rp1.getArea());
                System.out.println("perimeter of regular polygon by specified constructor : " + rp1.getPerimeter());
            }
        }

    }
    
}
