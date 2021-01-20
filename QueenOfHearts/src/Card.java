/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Card {
    private String cardSymbol;
    private Card[] cards;

    public Card(){
        cards = new Card[13];
        addCards();
    }

    public Card(String cardSymbol){
        this.cardSymbol = cardSymbol;
        cards = new Card[13];
        addCards();
    }



    private void addCards(){
        cards[0] = new Card("A");
        for(int i = 1; i < 11; i ++){
            if(i + 1 > 10){
                break;
            }
            int symbol = i + 1;
            cards[i] = new Card(Integer.toString(symbol));
        }
        cards[11] = new Card("J");
        cards[12] = new Card("Q");
        cards[13] = new Card("K");
    }

    public Card[] cards(){
        return cards;
    }

}
