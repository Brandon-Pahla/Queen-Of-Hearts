import java.util.Arrays;
import java.util.HashMap;

/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Cards {
    private String[] cards = new String[13];

    public Cards(){
        addCards();
    }

    private void addCards(){
        cards[0] = "Ace";
        for(int i = 1; i < 11; i ++){
            if(i + 1 > 10){
                break;
            }
            int symbol = i + 1;
            cards[i] = Integer.toString(symbol);
        }
        cards[10] = "Jack";
        cards[11] = "Queen";
        cards[12] = "King";
    }

    public String[] getCards(){
        return cards;
    }

    public String toString(){
        return Arrays.toString(this.getCards());
    }

}
