package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


import java.util.ArrayList;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;
    public void buildDeck() {
        usedCards = new ArrayList<Integer>();
        cards = new Card[52];
        //hearts
        for (int i= 0; i<4; i++){
            buildSuit(i);
        }
    }

    public void deal(Player player){
        boolean notAdded = true;
        int addedCard = 0;
        while(notAdded) {
            int random = (int) (Math.random() * 52);
            boolean inDeck = false;
            for (int cardNumber : usedCards) {
                if (cardNumber == random) {

                    inDeck = true;
                }
            }
            if (!inDeck){
                usedCards.add(random);
                addedCard = random;
                notAdded = false;
            }
        }

        Card playersNewCard = cards[addedCard];
        Hand playersHand = player.hand;
        playersHand.cards.add(playersNewCard);

    }
    private void buildSuit(int suitNumber){
        int currentCardNumber = suitNumber*13;
        for (int i=1; i<= 13; i++){
            Card currentCard = new Card();
            currentCard.suit = currentCard.suits[suitNumber];
            currentCard.cardValue = i;
            cards[currentCardNumber] = currentCard;
            currentCardNumber ++;
        }
    }
    public void printDeck(){
        for (Card card : cards){
            System.out.println("Card suit: " + card.suit);
            System.out.println("Card value: " + card.cardValue );
        }
    }

}
