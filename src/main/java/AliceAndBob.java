import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);
        while (true){
            System.out.println("Enter name.");
            String name = enterName.nextLine();
            if(name.equalsIgnoreCase("Alice")){
                System.out.println("Welcome, Alice.");
                break;
            } else if (name.equalsIgnoreCase("Bob")){
                System.out.println("Welcome, Bob.");
                break;

            }else {
                System.out.println("Try again.");
            }
        }
    }
}
