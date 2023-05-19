import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        
        //create necessary variables
        byte math,physic,chemistry,science,geography,history;

        try (//define instance of Scannner class for user input 
        Scanner inp = new Scanner(System.in)) {
            //get user inputs 
            System.out.print("Input your math grade: ");
            math = inp.nextByte();
            
            System.out.print("Input your physic grade: ");
            physic = inp.nextByte();

            System.out.print("Input your chemistry grade: ");
            chemistry = inp.nextByte();

            System.out.print("Input your science grade: ");
            science = inp.nextByte();

            System.out.print("Input your geography grade: ");
            geography = inp.nextByte();

            System.out.print("Input your history grade: ");
            history = inp.nextByte();
        }
        
        //total
        short total = (short) (math+physic+chemistry+science+geography+history);
        
        //average
        double average = total/6;
        
        //print result
        String result = (average >= 60) ? "Sinifi Gecti":"Sinifta Kaldi";
        System.out.println(result);
    }
}