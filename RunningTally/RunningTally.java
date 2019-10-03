import java.util.Scanner;

class RunningTally {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ask = true;
        System.out.println("Enter an Interger");
        int total = 0;

        while(ask == true) {
            System.out.println("Add: ");
            int input = sc.nextInt();
            if(input >= 0) {
                ask = true;
                total = total + input;
            } else if(input < 0) {
                ask = false;   
                System.out.println("Your total is: " +total); 
            }
        }

    }   
}
