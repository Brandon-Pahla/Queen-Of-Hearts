/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Queen {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Clubs", "Hears", "Diamonds"};
        Pack pack = new Pack(suits);
        pack.printPack();
        System.out.println("the pack has " + pack.getDeck().length + " cards");
    }
}
