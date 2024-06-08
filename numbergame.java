import java.util.Scanner;
import java.util.Random;
public class numbergame {
    public static void main(String[] args) {
        Random ran = new Random();

        int randomnumber = ran.nextInt(100) + 1;
        //System.out.println("random number is" + randomnumber);

        while (true) {
            System.out.println("Enter the guess number from 1 to 100");

            Scanner sc = new Scanner(System.in);
            int playersguessnumber = sc.nextInt();

            if (playersguessnumber == randomnumber) {
                System.out.println("Yep that's correct");
                break;
            } else if (randomnumber > playersguessnumber) {
                System.out.println("Nope sorry, I can give you hint ,that is the number is higher,guess again");
            } else {
                System.out.println("Nope sorry, I can give you hint, that is the number is lower,guess again");
            }
        }
    }
}

    

