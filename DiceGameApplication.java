import java.util.Random;

class DiceGameApplication{
    public static void main(String[] args){
        int total = 0;
        int a;
        System.out.println("Rolling dice...");
        for(int i = 0; i < 2; i++){
            Random r = new Random();
            a = 1 + r.nextInt(5);
            total += a; 
            System.out.println("Die " + (i+1) + ": " + a);
        }
        System.out.println("Total value: " + total);

    }
}