import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Pack {
    private final int numberOfCards = 52;
    private String[] suits;
    private String[] deck = new String[numberOfCards];
    private HashMap<String, Cards> pack = new HashMap<String, Cards>();

    public Pack(String [] suits){
        this.suits = suits;
        for(int i = 0; i < 4; i++ ){
            pack.put(suits[i], new Cards());
        }
        packageCards();
    }

    public void packageCards(){
        String[] suits = {"Spades", "Clubs", "Hears", "Diamonds"};
        String card;
        int head = 0;
        for(int i = 0; i < 4; i++ ){
            for (int j = 0; j < 13; j ++){
                if(pack.get(suits[i]).getCards()[j].equals("10")){
                    card = pack.get(suits[i]).getCards()[j] + "    of " + suits[i];
                }
                else{
                    card = pack.get(suits[i]).getCards()[j] + "     of " + suits[i] ;
                }
                deck[head] = card;
                head ++;

            }
        }
    }

    public void shuffle(){
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndexToSwap = rand.nextInt(deck.length);
            String temp = deck[randomIndexToSwap];
            deck[randomIndexToSwap] = deck[i];
            deck[i] = temp;
        }
    }

    public String[] getDeck(){
        return deck;
    }

    public String toString(){
        return Arrays.toString(deck);
    }

}
