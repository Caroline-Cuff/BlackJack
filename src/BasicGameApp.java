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

        int  cardIndex = 0;
       for (int i = 0; i < 4; i++) {
           for (int x = 0; x < 13; x++) {
               deck[cardIndex] = new Card(10, x, i);
               cardIndex++;
           }
       }
       shuffle();
        printDeck();



        // todo: fill the deck array with your favorite card
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
