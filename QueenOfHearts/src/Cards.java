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
        cards[0] = "A";
        for(int i = 1; i < 11; i ++){
            if(i + 1 > 10){
                break;
            }
            int symbol = i + 1;
            cards[i] = Integer.toString(symbol);
        }
        cards[10] = "J";
        cards[11] = "Q";
        cards[12] = "K";
    }

    public String[] getCards(){
        return cards;
    }

    public String toString(){
        return Arrays.toString(this.getCards());
    }

}
