/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2jpchapter9exercise9point9;

/**
 *
 * @author pc
 */
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    RegularPolygon(){
        System.out.println("Regular polygon crated by default value..");
        System.out.println("the number of sides in the regular polygon : " +n );
        System.out.println("the length of the side of the regular polygon : " +side);
        System.out.println("center coordinates of the regular polygon : ( " + x + "," + y + ")");
        
    }
    
    RegularPolygon(int n , double side , double x , double y){
        
        
            this.n = n;
            this.side = side;
            this.x = x;
            this.y = y;
            
            System.out.println("Regular polygon crated by specific value..");
            System.out.println("the number of sides in the regular polygon : " +n );
            System.out.println("the length of the side of the regular polygon : " +side);
            System.out.println("center coordinates of the regular polygon : ( " + x + "," + y + ")");
        
        
    }
    
    public double getArea(){
        double area = (this.n * (this.side * this.side)) / (( Math.tan(Math.PI / this.n )) * 4);
        if (area < 0)
            return area * -1;
        else
            return area;
    }
    
    public double getPerimeter(){
        return getN()*getSide();
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        if(n < 3 )
            System.out.println("n cannot be a negative number or less than 2!! Please set number..");
        else
            this.n = n;
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        if(side < 0)
            System.out.println("side cannot be a negative number!! please set positive number..");
        else
            this.side = side;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
