public class Coins {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        int quarters = x / 25;
        int cents = x % 25;
       

        System.out.println("Use " + quarters + " quarters and " + cents + " cents");


        
    }
}