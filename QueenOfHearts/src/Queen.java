import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * @author brandonpahla
 * @email brandon.m.paahla@gmail.com
 */
public class Queen {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static String[] pickedCards = new String[0];
    private static int headIndex = 0;
    private static final String CONGRATS = " <<<You win, congratulations!!!>>";
    private static final String TRY_AGAIN = ">>>Please pick again";
    private static boolean win = false;
    private static Scanner keyboard = new Scanner(System.in);

    private static void Game() {
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        Pack pack = new Pack(suits);
        gameLogic(pack);
    }

    public static void printList(String[] list){
        for(String card : list){
            System.out.println(card);
        }
    }

    private static void addPickedCard(String card){
        String[] temp = new String[pickedCards.length + 1];
        boolean notEmpty = pickedCards.length > 0;
        if(notEmpty){
            int i ;
            for(i = 0; i != pickedCards.length; i ++){
                temp[i] = pickedCards[i];
            }
        }
        temp[pickedCards.length] = card;
        pickedCards = temp;
    }

    private static String pick(Pack pack){
        pack.shuffle();
        String picked = pack.getDeck()[0];
        System.out.println("                You picked " + picked);
        addPickedCard(picked);
        return picked;
    }

    private static void displayAllCards(boolean printCards){
        if(printCards){
            printList(pickedCards);
        }
    }

    private static void isWin(String card){
        boolean isQueenOfHearts = card.equals("Queen of Hearts");
        if (isQueenOfHearts){
            System.out.println(ANSI_BLUE + CONGRATS + ANSI_RESET);
            System.out.println("you picked the following " + pickedCards.length + " cards in order to reach to the Queen of Hearts");
            System.out.print("Should all the cards be printed? [yes/no]:  ");
            String input = keyboard.nextLine();
            boolean response = input.equals("yes");
            displayAllCards(response);
            win = true;
        }else {
            System.out.print(ANSI_PURPLE + TRY_AGAIN + ANSI_RESET);
        }
    }

    private static void gameLogic(Pack pack){
        System.out.print(">>> Please press enter to pick a card!");
        while(true){
            String command = keyboard.nextLine();
            if (command.equals("")){
                isWin(pick(pack));
                if(win)
                    break;
            }else{
                System.out.println("Please press enter to pick a card!!!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "                <<<Randomly pick a card from a set of standard 52 cards>>>");
        System.out.println("                <<<The Game ends when you pic the Queen of Hearts>>>" + ANSI_RESET);
        Game();

    }

}
