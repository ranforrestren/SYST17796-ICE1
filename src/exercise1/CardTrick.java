package exercise1;
import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author modified by Ran Ren Jan 27, 2022
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random ran = new Random();
            int random = ran.nextInt(13) + 1;
            card.setValue(random);
            random = ran.nextInt(4);
            card. setSuit(Card.SUITS[random]);
            /* Prints card info for debug purposes */
            System.out.println(card.getValue());
            System.out.println(card.getSuit());
            
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        Card playerCard = new Card();
        System.out.println("Please enter a value:");
        playerCard.setValue(input.nextInt());
        System.out.println("Please enter a suit:");
        playerCard.setSuit(input.next());
        
        // If the guess is successful, invoke the printInfo() method below.
        for (Card card: hand) {
            if (playerCard.getValue() == card.getValue() && playerCard.getSuit().equals(card.getSuit())) {
                printInfo();
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * modified by Ran Ren Feb 3rd 2023
     */
    private static void printInfo() {
        // I'm Done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ran Ren");
        System.out.println();
        
        System.out.println("My goals for the year:");
        System.out.println("-- Learn some webdev frameworks and backend");
        System.out.println("-- Work on some personal portfolio projects");
	System.out.println("-- Study mindfulness and exercise");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Drawing");
        System.out.println("-- Watching Movies");
        System.out.println("-- Reading");

        System.out.println();
        
    
    }

}
