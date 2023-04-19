package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    public String name;
    public Hand hand;
    public int potValue;
    public Player(){
        hand = new Hand();
        name = "No name player";
        potValue = 0;
    }
    public boolean computerAI(){
        if (hand.score() < 16){
            return true;
        }else{
            return false;
        }
    }
}
