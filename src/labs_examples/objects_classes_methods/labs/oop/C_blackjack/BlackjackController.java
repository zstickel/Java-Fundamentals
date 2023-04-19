package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");
        playBlackJack();

    }
    public static void playBlackJack(){

        Player userPlayer = new Player();
        Player computerPlayer = new Player();
        Deck deck = new Deck();
        deck.buildDeck();
        deck.deal(userPlayer);
        deck.deal(userPlayer);
        deck.deal(computerPlayer);
        deck.deal(computerPlayer);
        System.out.println("Users hand: ");
        for (Card card: userPlayer.hand.cards) {
            System.out.println(card.cardValue + " of " + card.suit);
        }
        System.out.println("Computer players hand: ");
        for (Card card: computerPlayer.hand.cards){
            System.out.println(card.cardValue + " of " + card.suit);
        }
        boolean userKeepPlaying = true;
        boolean computerKeepPlaying = true;
        if (userPlayer.hand.bust() || computerPlayer.hand.bust()) {
            userKeepPlaying = false;
            computerKeepPlaying = false;
        }

        while ( userKeepPlaying || computerKeepPlaying ){
            if (userKeepPlaying) {
                userKeepPlaying = playerTurn(userPlayer, deck);
            }
            if (computerKeepPlaying) {
                computerKeepPlaying = computerTurn(userPlayer, computerPlayer, deck);
            }
        }
        if (userPlayer.hand.bust()){
            System.out.println("User player busted, computer wins!");
            return;
        }
        if (computerPlayer.hand.bust()){
            System.out.println("Computer busted, player wins");
            return;
        }
        if (userPlayer.hand.score() > computerPlayer.hand.score()){
            System.out.println("User player wins!");
        }else if (userPlayer.hand.score() < computerPlayer.hand.score()){
            System.out.println("Computer wins!");
        }else{
            System.out.println("Push. No one wins.");
        }
    }

    public static boolean computerTurn(Player userPlayer, Player computerPlayer, Deck deck){
        if (userPlayer.hand.bust()){
            return false;
        }
        if (computerPlayer.computerAI()){
            System.out.println("Computer hits.");
            deck.deal(computerPlayer);
            System.out.println("Computers hand: ");
            for (Card card: computerPlayer.hand.cards) {
                System.out.println(card.cardValue + " of " + card.suit);
            }
            if (computerPlayer.hand.bust()){
                System.out.println("Computer busted.");
                return false;
            }else{
                return true;
            }
        }else{
            System.out.println("Computer stands.");
            for (Card card: computerPlayer.hand.cards) {
                System.out.println(card.cardValue + " of " + card.suit);
            }
            return false;
        }
    }
    public static boolean playerTurn(Player player, Deck deck){
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like another card?");
        String userInput = in.nextLine();
        if (userInput.equals("y")){
            deck.deal(player);
            System.out.println("Users hand: ");
            for (Card card: player.hand.cards) {
                System.out.println(card.cardValue + " of " + card.suit);
            }
            if (player.hand.bust()){
                System.out.println("Sorry - you busted");
                return false;
            }else{
                return true;
            }
        }else {
            return false;
        }
    }
}
