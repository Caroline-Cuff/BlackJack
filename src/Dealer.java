public class Dealer {


    public boolean isOver;
    public int cardTotal;
    public Card[] dealerHand;
    public boolean isBust;

    public Dealer(){


    }

    public void printInfo(){
        System.out.println("These are the dealers cards: ");
        for (int x = 0; x< dealerHand.length; x++){
            System.out.println(dealerHand);
        }
        System.out.println("The dealer's total is " + cardTotal + ". It is " + isOver + " that the dealer is over." +
                "It is " + isBust + " that they are bust.");
    }

}
