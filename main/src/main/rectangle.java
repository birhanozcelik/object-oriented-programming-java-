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
public class rectangle {
    private double edge1 = 1.5;
    private double edge2 = 1.0;
    
    
    rectangle(){
        
    }
    
    rectangle(double edge1 , double edge2){
        this.edge1 = edge1;
        this.edge2 = edge2;
        
    }
    
    public double getArea(){
        return getEdge1() * getEdge2();
    }
    
    public double getPerimeter(){
        return 2 * (getEdge1() + getEdge2());
    }

    /**
     * @return the edge1
     */
    public double getEdge1() {
        return edge1;
    }

    /**
     * @param edge1 the edge1 to set
     */
    public void setEdge1(double edge1) {
        if(edge1 < 0)
            System.out.println("edge must be positive number!!");
        else
            this.edge1 = edge1;
        
        
    }

    /**
     * @return the edge2
     */
    public double getEdge2() {
        return edge2;
    }

    /**
     * @param edge2 the edge2 to set
     */
    public void setEdge2(double edge2) {
        if(edge2 < 0)
            System.out.println("edge must be a positive mumber!!!");
        else
            this.edge2 = edge2;
        
        
    }
    
}
