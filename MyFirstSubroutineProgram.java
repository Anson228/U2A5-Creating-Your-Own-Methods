
package my.first.subroutine.program;

import java.util.Scanner;

public class MyFirstSubroutineProgram {
   
    public static void averages(double n2, double n3, double n4)
    {
        //Finding averages of 3 numbers
        double aver = (n4 + n2 + n3)/3;
        System.out.println("The averages is:"+ aver);
    }
    
    public static void acceleration(double n2, double n3, double n4){
        //Finding acceleration
        double acce = (n2 - n3)/n4;
        System.out.println("The acceleration is:"+ acce);
    }
    
    public static void circumferenceofcircle(double n2){
        //Determining diameter, circumference of circle
        double diameter = n2 * 2;
        double circumference = 2 * 3.14 * n2;
        System.out.println("The diameter is:"+ diameter);
        System.out.println("The circumference of circle is :"+ circumference);
    }
    
    public static void angle(double n2, double n3){
        //Finding missing angles for triangles
        double angle = 180 - n2 - n3;
        System.out.println("The angle is:"+ angle);
    }
    
    public static void power(double n2, double n3){
        //Determining the power of a number
        double power = 1;
        for( int i = 0; i < n2; i++){
        power = power * n3;
        }
        System.out.println("The power is:"+ power);
    }
    
    public static void main(String[] args) {
        //create the scanner object to read input from the user
        Scanner keyInput = new Scanner(System.in);
        //variables required
        double [] num = new double [8];
        int num1;
        System.out.println("Please enter a number from 1 to 5.");
        System.out.println("1: Finding averages of 3 numbers; 2: Finding acceleration; 3: Determining the power of a number;");
        System.out.println("4:Determining diameter, circumference of circle; 5: Finding missing angles for triangles;");
        num1 = keyInput.nextInt();
        //switch expression
        switch(num1){
            //case statement
            case 1:
                System.out.println("Please enter first number:");
                num[2] = keyInput.nextDouble();
                System.out.println("Please enter second number:");
                num[3] = keyInput.nextDouble();
                System.out.println("Please enter third number:");
                num[4] = keyInput.nextDouble();
                averages(num[2],num[3],num[4]);
                break;
            case 2:
                System.out.println("Please enter the final of velocity.");
                num[2] = keyInput.nextDouble();
                System.out.println("please enter the inital of velocity");
                num[3] = keyInput.nextDouble();
                System.out.println("Please enter the time");
                num[4] = keyInput.nextDouble();
                acceleration(num[2],num[3],num[4]);
                break;
            case 3:
                System.out.println("Please enter the power");
                num[2] = keyInput.nextDouble();
                System.out.println("Please enter the number");
                num[3] = keyInput.nextDouble();
                power(num[2],num[3]);
                break;
            case 4:
                System.out.println("Please enter the radius");
                num[2] = keyInput.nextDouble();
                circumferenceofcircle(num[2]);
                break;
            case 5:
                System.out.println("Please enter the angle.");
                num[2] = keyInput.nextDouble();
                System.out.println("Please enter the rest of angle");
                num[3] = keyInput.nextDouble();
                angle(num[2],num[3]);
                break;
                
        }
    }
    
}
