package kata.solutions.java.kyu6;

import java.util.*;

/**
 * Simple card game
 * 
 * Steve and Josh are bored and want to play something. They don't want to think
 * too much, so they come up with a really simple game. Write a function called
 * winner and figure out who is going to win.
 * 
 * They are dealt the same number of cards. They both flip the card on the top 
 * of their deck. Whoever has a card with higher value wins the round and gets 
 * one point (if the cards are of the same value, neither of them gets a point).
 * After this, the two cards are discarded and they flip another card from the 
 * top of their deck. They do this until they have no cards left.
 * 
 * deckSteve and deckJosh are arrays representing their decks. They are filled
 * with "cards", represented by a single character. The card rank is as follows
 * (from lowest to highest):
 * 
 * '2','3','4','5','6','7','8','9','T','J','Q','K','A'
 * 
 * Every card may appear in the deck more than once. Figure out who is going to
 * win and return who wins and with what score:
 *"Steve wins x to y" if Steve wins, where x is Steve's score, y is Josh's score
 * "Josh wins x to y" if Josh wins, where x is Josh's score, y is Steve's score
 * "Tie" if the score is tied at the end of the game.
 * 
 * Example:
 * 
 * Steve is dealt ['A','7','8']
 * Josh is dealt  ['K','5','9']
 * 
 * In first round, ace beats king and Steve gets one point.
 * In second round, 7 beats 5 and Steve gets his second point.
 * In third round, 9 beats 8 and Josh gets one point.
 * 
 * You should return "Steve wins 2 to 1".
 */

/**
 * FIXME with case StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am")
 */
public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {
        int len = deckSteve.length;
        String result = "";
        Map<String, Integer> deck = new HashMap<String, Integer>();
        deck.put("2", 0);
        deck.put("3", 1);
        deck.put("4", 2);
        deck.put("5", 3);
        deck.put("6", 4);
        deck.put("7", 5);
        deck.put("8", 6);
        deck.put("9", 7);
        deck.put("T", 8);
        deck.put("J", 9);
        deck.put("Q", 10);
        deck.put("K", 11);
        deck.put("A", 12);
        int steveScore = 0;
        int joshScore = 0;
        for (int i = 0; i < len; i++) {
            if (deck.get(deckSteve[i]) > deck.get(deckJosh[i])) steveScore++;
            else if (deck.get(deckSteve[i]) < deck.get(deckJosh[i])) joshScore++;
        }
        if (steveScore > joshScore) result = "Steve wins " + steveScore + " to " + joshScore;
        else if (steveScore < joshScore) result = "Josh wins " + joshScore + " to " + steveScore;
        else result = "Tie";
        return result;
    }
}