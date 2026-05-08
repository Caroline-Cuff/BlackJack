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
        for (int x = 0; x < 13; x++ ){
            deck [x] = new Card(10, x,"Hearts");
            deck[x].printInfo();
        }


        // todo: fill the deck array with your favorite card

    }


}
