package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter MikeTyson = new Fighter("Tike Myson", 20, 100, 93, randomizeDodge());
        Fighter EvanderHolyfield = new Fighter("Bitten ear", 15, 95, 91, randomizeDodge());
        Ring r = new Ring(MikeTyson, EvanderHolyfield, 90, 100);
        r.run();
    }

    private static int randomizeDodge(){
        int randValue = (int) (Math.random()*100);
        return randValue;
    }
}
