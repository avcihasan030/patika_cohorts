import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
    
        byte radius,angle;//define variables of radius and angle of circular area

        //ask for user input using try-with-resources 
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Input radius: ");
            radius = scan.nextByte();

            System.out.print("Input angle: ");
            angle = scan.nextByte();
        }
        
        //return the result value 
        double area = circleSliceAreaCalculation(radius, angle);
        System.out.printf("Area of circular slice is : %.2f\n",area);
    }
    
    //method finds the area of the circle
    private static double circularArea(byte radius){
        return (Math.PI)*(Math.pow(radius, 2));
    }

    //method finds the circumference of the circle 
    private static double circumference(byte radius){
        return 2*(Math.PI)*radius;
    }

    //method calculates the area of the circular slice
    private static double circleSliceAreaCalculation(byte radius,byte angle){
        return ((Math.PI)*Math.pow(radius, 2)*angle)/360;
    }
}
