import java.util.Scanner;

class GuessingGame {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0; 
        int total = 0;
        number = (int) (Math.random()*100);
        
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        int guess = 0;
        while(guess != number) {
            System.out.println("What is your guess?");
            guess = sc.nextInt();
            if(guess > number) {
                System.out.println("Too high ...");
            }
            else if(guess < number) {
                System.out.println("Too low ...");
            }
            total++;
        }
        System.out.println("You've guessed my number! Good job!");
        System.out.println(" It only took you "+ total +" tries");
    }
}
