//java code prints prime numbers between 1 and 100

public class PrimeNumbers {
    public static void main(String[] args) {
       
        for(short i = 2;i <= 100;i++){
            if(isPrime(i) == true){
                System.out.print(" " + i);
            }else continue;
        }
    }

    private static boolean isPrime(short num){
        for(short i = 2;i <= num/2;i++){
            if(num%i == 0)
                return false;
                
        }
        return true;
    }
}
