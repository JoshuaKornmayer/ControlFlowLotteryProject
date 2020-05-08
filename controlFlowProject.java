import java.util.Scanner;
import java.util.Random;

public class controlFlowProject {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = userInput.next();
        System.out.println("Hello " + name);

        System.out.println("Would you like to continue to the interactive portion? Answer y or yes");

        char interactivePortion = userInput.next().charAt(0);

        while (interactivePortion == 'y') {
            System.out.println("What is name of your favorite pet?");
            String pet = userInput.next();

            System.out.println("What is the age of your favorite pet?");
            int petAge = userInput.nextInt();

            System.out.println("What is your lucky number?");
            int luckyNum = userInput.nextInt();

            System.out.println("What is the number of your favorite football Quarterback?");
            int favQBNum = userInput.nextInt();

            System.out.println("What is two-digit model year of their car?");
            int modelYear = userInput.nextInt();

            System.out.println("What is the first name of your favorite actor or actress?");
            String actor = userInput.next();

            System.out.println("Enter a random number between 1 and 50: ");
            int randNumb = userInput.nextInt();

            System.out.println("Enter another random number between 1 and 50: ");
            int randomNumb1 = userInput.nextInt();

            System.out.println("Enter a second random number between 1 and 50: ");
            int randomNumb2 = userInput.nextInt();

            System.out.println("Give me one more random number between 1 and 50: ");
            int randomNumb3 = userInput.nextInt();

            Random rand = new Random();
            int rand1 = rand.nextInt(3);
            int rand2 = rand.nextInt(3);
            int rand3 = rand.nextInt(3);

            System.out.println(rand1);
            System.out.println(rand2);
            System.out.println(rand3);

            int magicBall = 0;
            if (rand1 == 0 || rand2 == 1 || rand3 == 2) {
                magicBall = favQBNum * randomNumb1;
                while (magicBall > 75) {
                    magicBall = magicBall - 75;
                }

            } else if (rand1 == 1 || rand2 == 2 || rand3 == 0) {
                magicBall = luckyNum * randomNumb2;
                while (magicBall > 75) {
                    magicBall = magicBall - 75;
                }
            } else if (rand1 == 2 || rand2 == 0 || rand3 == 1) {
                magicBall = luckyNum * randomNumb3;
                while (magicBall > 75) {
                    magicBall = magicBall - 75;
                }
            }

            int nonMagicNumb1 = modelYear + randNumb;
            if (nonMagicNumb1 > 65) {
                nonMagicNumb1 = nonMagicNumb1 - 65;
            }

            int nonMagicNumb2 = randNumb - rand3;
            if (nonMagicNumb2 < 0) {
                nonMagicNumb2 = nonMagicNumb2 + 65;
            }

            int nonMagicNumb3 = petAge + modelYear;
            if (nonMagicNumb3 > 65) {
                nonMagicNumb3 = nonMagicNumb3 - 65;
            }

            int nonMagicNumb4 = actor.charAt(0);
            if (nonMagicNumb4 > 65) {
                nonMagicNumb4 = nonMagicNumb4 - 65;
            }

            int nonMagicNumb5 = favQBNum + petAge + luckyNum;
            if (nonMagicNumb5 > 65) {
                nonMagicNumb5 = nonMagicNumb5 - 65;
            }

            System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d  Magic Ball: %d", nonMagicNumb1, nonMagicNumb2,
                    nonMagicNumb3, nonMagicNumb4, nonMagicNumb5, magicBall);

            System.out.println();
            System.out.println(
                    "Would you like to answer the questions again to generate a new set of Lottery numbers? Answer y or yes");
            interactivePortion = userInput.next().charAt(0);

        }

        System.out.println("Please return later to complete the survey.");

        userInput.close();

    }

}