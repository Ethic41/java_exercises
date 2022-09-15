import java.util.Hashtable;
import java.util.Map;

public class Blackjack {

        Map<String, Integer> cards;

    public Blackjack(){
        cards = new Hashtable<String, Integer>();
        cards.put("two", 2);
        cards.put("three", 3);
        cards.put("four", 4);
        cards.put("five", 5);
        cards.put("six", 6);
        cards.put("seven", 7);
        cards.put("eight", 8);
        cards.put("nine", 9);
        cards.put("ten", 10);
        cards.put("jack", 10);
        cards.put("queen", 10);
        cards.put("king", 10);
        cards.put("ace", 11);
    }

    public int parseCard(String card) {
        return cards.containsKey(card) ? cards.get(card) : 0;
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21 ? true : false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && (dealerScore != 10 && dealerScore != 11)){
            return "W";
        }
        else{
            return "S";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17){
            return "S";
        }
        else if (handScore <= 11){
            return "H";
        }
        else {
            return dealerScore >= 7 ? "H" : "S"; 
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (card1 == card2 && card1 == "ace" && dealerCard == card1){
            return "P";
        }

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
