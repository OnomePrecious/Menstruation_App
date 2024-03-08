package CardShuffling;

public class Card {
    private String face;
    private String suit;

    public Card(String CardFace, String SuitFace){
        this.face = CardFace;
        this.suit = SuitFace;
    }
    public String toString(){
        return face + " of " + suit;
    }
}
