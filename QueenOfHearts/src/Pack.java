import java.util.HashMap;

/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Pack {
    private final int numberOfCards = 52;
    private String[] suits;
    private HashMap<String, Cards> pack = new HashMap<String, Cards>();

    public Pack(String [] suits){
        this.suits = suits;
        for(int i = 0; i < 4; i++ ){
            pack.put(suits[i], new Cards());
        }
//        System.out.println(pack.get(suits[0]).getCards()[4]);
    }

    public void printPack(){
        String[] suits = {"Spades", "Clubs", "Hears", "Diamonds"};
        for(int i = 0; i < 4; i++ ){
            for (int j = 0; j < 13; j ++){
                System.out.println(pack.get(suits[i]).getCards()[j] + " of " + suits[i]);

            }
        }
    }

}
