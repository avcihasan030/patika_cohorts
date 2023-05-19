import java.util.Scanner;

public class FlightTicket{
    public static void main(String[] args) throws lessThanZeroException {
        
        //defining variables
        int distance,tripType,age;
        Scanner inp = new Scanner(System.in);
    
    
        System.out.print("Input distance in kilometers: ");
        distance = inp.nextInt();
        if(distance < 0){

            throw new lessThanZeroException("Invalid data etered!");
       
        }else{

        System.out.print("Input your age: ");
        age = inp.nextInt();

        if(age < 0){

            throw new lessThanZeroException("Invalid data entered!");
        
        }else{

        System.out.println("Input the trip type (1 => One way ticket, 2 => Round trip ticket): ");
        tripType = inp.nextInt();

        if(tripType < 1 || tripType > 2){

            System.out.println("Invalid data entered!");
            return;
         }
        }
      }

       calcTicetPrice(distance,age,tripType);
    }

    //method that calculates ticket price 
    private static void calcTicetPrice(int distance, int age, int tripType) {
        double normalAmount;
        double amountWithDiscount;
        double ageDiscount;
        double rountTripDiscount;

        switch (tripType) {
            case 1:
                if(age < 12){
                    normalAmount = (distance*0.10);
                    ageDiscount = normalAmount*0.5;
                    amountWithDiscount = normalAmount - ageDiscount;
                    System.out.println("Total amount = " + amountWithDiscount);
                }else if(age >= 12 && age  <= 24){
                    normalAmount = (distance*0.10);
                    ageDiscount = normalAmount*0.10;
                    amountWithDiscount =  normalAmount - ageDiscount;
                    System.out.println("Total amount = " + amountWithDiscount);
                }else if(age >= 65){
                    normalAmount = (distance*0.10);
                    ageDiscount = normalAmount*0.30;
                    amountWithDiscount =  normalAmount - ageDiscount;
                    System.out.println("Total amount = " + amountWithDiscount);
                }else{
                    amountWithDiscount =  (distance*0.10);
                    System.out.println("Total amount = " + amountWithDiscount);
                }
                break;
            case 2:
                if(age < 12){

                    normalAmount = (distance*0.10);
                    ageDiscount = normalAmount*0.5;
                    amountWithDiscount = (normalAmount - ageDiscount);
                    rountTripDiscount = amountWithDiscount*0.20;
                    amountWithDiscount = (amountWithDiscount-rountTripDiscount)*2;
                    System.out.println("Total amount = " + amountWithDiscount);
                
                }else if(age >= 12 && age  <= 24){
                   
                    normalAmount = (distance*0.10);
                    ageDiscount = normalAmount*0.10;
                    amountWithDiscount = (normalAmount - ageDiscount);
                    rountTripDiscount = amountWithDiscount*0.20;
                    amountWithDiscount = (amountWithDiscount-rountTripDiscount)*2;
                    System.out.println("Total amount = " + amountWithDiscount);
              
                }else if(age >= 65){
                  
                    normalAmount = (distance*0.10);
                    ageDiscount = normalAmount*0.30;
                    amountWithDiscount = (normalAmount - ageDiscount);
                    rountTripDiscount = amountWithDiscount*0.20;
                    amountWithDiscount = (amountWithDiscount-rountTripDiscount)*2;
                    System.out.println("Total amount = " + amountWithDiscount);
              
                }else{
                   
                    normalAmount = (distance*0.10);
                    rountTripDiscount = normalAmount*0.20;
                    amountWithDiscount =  (normalAmount-rountTripDiscount)*2;
                    System.out.println("Total amount = " + amountWithDiscount);
               
                }
                break;
            default:
                break;
        }
    }

    //inner class representing custom exception
    static class lessThanZeroException extends Exception{

        public lessThanZeroException(String string) {

            //calling the constructor of parent exception
            super(string);
        }
    }

}