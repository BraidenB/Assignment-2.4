import java.util.Scanner;

class Bar { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What character do you want your bar to be made of?");
        String character;
        character = sc.nextLine();
        System.out.println("How long do you want your bar?");
        int x = sc.nextInt();
        int i = 0;
        while(i < x) {
            System.out.print(character);
            i++;
        }
    }
}
