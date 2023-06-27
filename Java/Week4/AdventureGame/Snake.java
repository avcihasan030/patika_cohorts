package AdventureGame;

import java.util.Random;

public class Snake extends Monster{

    public Snake( int award) {
        super(4, "Snake", damage(), 14, award);
        //TODO Auto-generated constructor stub
    }

    private static int damage(){
        Random random = new Random();
        return random.nextInt(4) + 3;
        
    }
}
