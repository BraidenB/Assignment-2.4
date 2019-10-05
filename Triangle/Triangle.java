import java.util.Scanner;

class Triangle { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What character do you want your bar to be made of?");
        String character;
        character = sc.nextLine();
        System.out.println("How tall do you want your triangle?");
        int x = sc.nextInt();
        for (int f= 0; f < x; f++) {
            for(int i = 0; i < f; i++) {
                System.out.print(character); 
            }
            System.out.println(character);
        }
    }
}