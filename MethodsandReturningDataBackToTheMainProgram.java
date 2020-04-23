
package methodsandreturningdatabacktothemainprogram;
import java.util.Scanner;
public class MethodsandReturningDataBackToTheMainProgram {

    public static void averages(double n2, double n3, double n4)
    {
        //Finding averages of 3 numbers
        double aver = ( n2 + n3 + n4)/3;
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
    
    public static void degrees(double n2){
        //Convert an angle in radians to an angle in degrees
        double degrees;
        degrees = (Math.toDegrees(n2));
        System.out.println("The degrees is:"+ degrees);
    }
    
    public static void decimal(double n2){
        //Keep two decimal places
        double decimal;
        decimal = (Math.round(n2));
        System.out.println("The number is:"+ decimal);
    }
    
    public static void prime(double n2){
        //Determining if a number is prime
        if (n2 > 5) {
           if (n2 % 6 != 1 && n2 % 6 != 5) {
               System.out.println("NO");
           }
           else{
               System.out.println("Yes");
           }
        }
        else if (n2 == 5){ 
            System.out.println("Yes");
        }
        else{
            System.out.println("Yes");
        }
    }
    
    public static void radians(double n2){
        //Convert an angle in degrees to an angle in radians
        double radians;
        radians = (Math.toRadians(n2));
        System.out.println("The degrees is:"+ radians);
    }
    
    public static void hypotenuse(double n2, double n3){
        //Finding missing the hypotenuse of a triangle for triangles
        double slide;
        slide = (Math.hypot(n2,n3));
        System.out.println("The silde is:" + slide);
    }
    
    public static void main(String[] args) {
        //create the scanner object to read input from the user
        Scanner keyInput = new Scanner(System.in);
        //variables required
        double [] num = new double [5];
        int num1;
        int i = 0;
        while(i == 0){
        //get the choice from the user
        System.out.println("Please enter a number from 1 to 5.");
        System.out.println("1: Finding averages of 3 numbers; 2: Finding acceleration; 3: Determining the power of a number;");
        System.out.println("4: Determining diameter, circumference of circle; 5: Finding missing angles for triangles;");
        System.out.println("6: Convert an angle in radians to an angle in degrees; 7: Keep two decimal places;");
        System.out.println("8: Determining if a number is prime; 9: Convert an angle in degrees to an angle in radians;");
        System.out.println("10: Finding missing the hypotenuse of a triangle for triangles; 11: End");
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
            case 6:
                System.out.println("Please the enter an angle in radians.");
                num[2] = keyInput.nextDouble();
                degrees(num[2]);
                break;
            case 7:
                System.out.println("Please enter the value which need to keep decimal two place.");
                num[2] = keyInput.nextDouble();
                decimal(num[2]);
                break;
            case 8:
                System.out.println("Please enter the value");
                num[2] = keyInput.nextDouble();
                prime(num[2]);
                break;
            case 9:
                System.out.println("Please the enter an angle in degrees. ");
                num[2] = keyInput.nextDouble();
                radians(num[2]);
                break;
            case 10:
                System.out.println("Please enter the first slide.");
                num[2] = keyInput.nextDouble();
                System.out.println("Please enter the second slide.");
                num[3] = keyInput.nextDouble();
                hypotenuse(num[2],num[3]);
                break;
            case 11:
                i++;
                break;
        }
    }
    }
}
