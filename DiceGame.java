import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	System.out.println("What is your name?");
	System.out.print("> ");
	String name = scanner.nextLine();
	System.out.println("Hello, " + name + "!");

	System.out.println("Rolling dice...");
	
	int dice1 = random.nextInt(6);
	System.out.println("Die 1:" + dice1);
	
	int dice2 = random.nextInt(6);
	System.out.println("Die 2:" + dice2);

	System.out.println("Total value: " + (dice1+dice2));
    }
}

