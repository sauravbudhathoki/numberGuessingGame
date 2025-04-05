import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Number Guessing Game

        Random random = new Random();
        Scanner scanner =new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min =1;
        int max =100;
        int randomNumber =random.nextInt(min,max+1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n",min,max);

        do{
            System.out.print("Enter a guess:");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("Too Low! Try again.");
            } else if (guess>randomNumber) {
                System.out.println("Too High! Try Again.");
            }else {
                System.out.println("CORRECT! The number was "+ randomNumber);
                System.out.println("Number of attempts is : "+ attempts);
            }

        }while(guess !=randomNumber);

        //System.out.println("You have Won!");
        scanner.close();

    }
}