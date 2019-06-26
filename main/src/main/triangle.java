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
public class triangle {
    private double edge1 = 1;
    private double edge2 = 2;
    private double edge3 = 3;
    private double h = 1.8;
    
    static int numberOfObjects;
    
    triangle(){
        numberOfObjects++;
    }
    
    triangle(int edge1 , int edge2 , int edge3 , int h){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.h = h;
        numberOfObjects++;
    }
    
    public double getPerimeter(){
       return edge1 + edge2 + edge3;
    }
    
    public double getArea(){
        return (edge3 * h) / 2;
    }
    
    
    
    
    
}