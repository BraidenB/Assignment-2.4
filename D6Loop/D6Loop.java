import java.util.Scanner;

class D6Loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = 0;
        int total = 0;
        String decision = "y";
        
        while (decision.equals("y")) {
            System.out.println("How many D6's do you want to roll?");
            int num = sc.nextInt();
            System.out.println(" ");
            System.out.print("You rolled: ");
            int i = 0;
            while(i < num) {
                roll = (int) (Math.random()*6) + 1;
                System.out.print(roll + " "); 
                total = total + roll;
                i++;
            }
            System.out.println(" ");
            System.out.println("total: " + total);
            System.out.println(" ");
            System.out.println("Again? [y/n]");
            decision = sc.next();
            System.out.println(" ");
        }        
    }
}
