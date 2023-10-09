/********************************************************************************
 *@file BlackJack.java
 *@brief This program lets the user play a simplified version of BlackJack
 *@author Destiny Hale
 ********************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class DailyEncouragement {
    //Generates a number from 0 to 14
    static int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(14);
    }

    public static void main(String[] args) {
        // Set up Scanner
        Scanner userInput = new Scanner(System.in);

        //Prompt User
        System.out.println("Would you like a positive quote?");
        System.out.println("");

        System.out.println("yes or no");
        System.out.println("");

        String response = userInput.nextLine();

        //create array to contain quotes
        String[] quoteArray = new String[15];
        quoteArray[0] = "'Many of life’s failures are people who did not realize how close they were to success when they gave up.' Thomas A. Edison";
        quoteArray[1] = "'Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time.' Thomas A. Edison";
        quoteArray[2] = "'You will never do anything in this world without courage. It is the greatest quality of the mind next to honor.' Aristotle";
        quoteArray[3] = "'It is during our darkest moments that we must focus to see the light.' Aristotle";
        quoteArray[4] = "'Tomorrow hopes we have learned something from yesterday.' John Wayne";
        quoteArray[5] = "'Nothing is impossible. The word itself says I’m possible!' Audrey Hepburn";
        quoteArray[6] = "'If you want to improve, be content to be thought foolish a stupid.' Epictetus";
        quoteArray[7] = "'It does not matter how slowly you go, so long as you do not stop.' Confucius";
        quoteArray[8] = "'The way I see it, if you want the rainbow, you gotta put up with the rain.' Dolly Parton";
        quoteArray[9] = "'Only put off until tomorrow what you are willing to die having left undone.' Pablo Picasso";
        quoteArray[10] = "'The successful warrior is the average man, with laser-like focus.' Bruce Lee";
        quoteArray[11] = "'If you always do what interests you, at least one person is pleased.' Katharine Hepbur";
        quoteArray[12] = "'It is never too late to be what you might have been.' George Eliot";
        quoteArray[13] = "'In any moment of decision, the best thing you can do is the right thing, the next best thing is the wrong thing, and the worst thing you can do is nothing.' Theodore Roosevelt";
        quoteArray[14] = "'It's okay to look back at the past. Just don't stare.' Benjamin Dove";


        // If Loop to handle user response
        if (response.equals("yes")) {
            System.out.println("");
            System.out.println("Okay! Give me just one moment.");
            System.out.println("");
            //grabs random quote
            int arrayIndex = getRandomIndex();
            System.out.println(quoteArray[arrayIndex]);

            System.out.println("");
            System.out.println("Hope that brightened your day!");
        } else {

            System.out.println("");
            System.out.println("Oh ok...");
            System.out.println("Let me know if you change your mind.");
        }
    }
}
