import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        byte math,physic,turkish,chemistry,music;
        short total = 0;
        byte counter = 0;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Math grade: ");
        math = inp.nextByte();
        if(validate(math)){
            total += math;
            counter++;
        }

        System.out.println("Physic grade: ");
        physic = inp.nextByte();
        if(validate(physic)){
        total += physic;
        counter++;
        }

        System.out.println("Turkish grade: ");
        turkish = inp.nextByte();
        if(validate(turkish)){
        total += turkish;
        counter++;
        }

        System.out.println("Chemistry grade: ");
        chemistry = inp.nextByte();
        if(validate(chemistry)){
        total += chemistry;
        counter++;
        }

        System.out.println("Music grade: ");
        music = inp.nextByte();
        if(validate(music)){
        total += music;
        counter++;
        }

        findAvarage(total,counter);
    }
    
    private static boolean validate(byte grade){
        if(grade >= 0 && grade <= 100)
            return true;
        return false;
    }

    private static void findAvarage(short total,byte counter){
        if((total/counter) < 55){
            System.out.println("You failed the class!");
        }else
        System.out.println("Average grade: " + (total/counter));
    }
}
