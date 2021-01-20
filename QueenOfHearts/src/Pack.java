import java.util.HashMap;

/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Pack {
    private final int numberOfCards = 52;
    private final HashMap pack = new HashMap();

    public Pack(){
        Card card = new Card();
        addCards("Spades",card);
    }

    private void addCards(String suit, Card card){
        pack.put(suit,card.cards());
    }

    
}
