/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Queen {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Clubs", "Hears", "Diamonds"};
        Pack pack = new Pack(suits);
        System.out.println("This is the original pack");
        System.out.println(pack);
        pack.shuffle();
        System.out.println("This is the shuffled pack");
        System.out.println(pack);
        pack.shuffle();
        System.out.println("This is another shuffled pack");
        System.out.println(pack);
    }
}
