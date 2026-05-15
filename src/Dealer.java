public class Dealer {


    public boolean isOver;
    public int cardTotal;
    public Card[] dealerHand;
    public boolean isBust;

    public Dealer(){

        isOver = false;
        cardTotal = 0;
        dealerHand = new Card[2];
        isBust = false;

    }

    public void printInfo(){
        System.out.println("These are the dealers cards: ");
        for (int x = 0; x< dealerHand.length; x++){
            dealerHand[x].printInfo();
        }
        if (cardTotal >= 16){
            isOver = true;
        }
        System.out.println("The dealer's total is " + cardTotal + ". It is " + isOver + " that the dealer is over 16." +
                ". It is " + isBust + " that they are bust.");
    }

    public void calculateTotal(){

        int addValue = 0;
        for (int d = 0; d< dealerHand.length; d++){
            addValue = addValue + dealerHand[d].cardValue;
        }
        cardTotal = addValue;
    }

}
