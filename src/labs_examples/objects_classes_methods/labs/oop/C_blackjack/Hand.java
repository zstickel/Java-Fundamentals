package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    public ArrayList<Card> cards;
    public int handValue;
    public Hand(){
        cards = new ArrayList<Card>();
        handValue = 0;
    }
    public int score(){
        updateHandValue();
        return handValue;
    }
    private void updateHandValue(){
        handValue = 0;
        for (Card card: cards){
            handValue += card.cardValue;
        }
    }
    public boolean bust(){
        if (score() > 21){
            return true;
        }else{
            return false;
        }
    }
}
