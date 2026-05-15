import java.util.Scanner;

public class BasicGameApp {

    public Card[]deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;

    public static void main(String[] args) {
        new BasicGameApp();
        // todo:
    }

    public BasicGameApp(){
        System.out.println("Welcome to Blackjack. ");
        deck = new Card [52];
        p1 = new Player();
        d1 = new Dealer();

        int  cardIndex = 0;
       for (int i = 0; i < 4; i++) {
           for (int x = 0; x < 13; x++) {
               deck[cardIndex] = new Card(10, x, i);
               cardIndex++;
           }
       }
       shuffle();
    //   printDeck();

       // give player cards
       p1.playerHand[0] = deck[0];
       p1.playerHand[1] = deck [1];
     //   System.out.println("Your cards are " + p1.playerHand[0] + "and "+ p1.playerHand[1]);
       // todo: give dealer cards
        d1.dealerHand[0] = deck[2];
        d1.dealerHand[1]=deck[3];

        //to receive inputs

        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String pName = s.nextLine();
        System.out.println(pName);
        p1.name = pName;
        p1.calculateTotal();
        p1.printInfo();
        d1.calculateTotal();
        d1.printInfo();


    }

    public void printDeck(){
        for (int x = 0; x < deck.length; x++ ){
            deck[x].printInfo();
        }
    }

    public void shuffle(){
        for(int c = 0; c < deck.length; c++){
            int randy = (int) (Math.random()*52);
            Card helper = deck[randy];
            deck[randy] = deck[c];
            deck[c] = helper;


        }
    }

}
