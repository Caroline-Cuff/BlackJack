public class Player {


    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String name;
    public Card[] playerHand;

    public Player(){

        cardTotal = 0;
        isBust = false;
        playerHand = new Card[2];
        isHit = false;
        name = "me";

    }

    public void printInfo(){
        System.out.println("These are your cards," + name + ": ");
        for (int x = 0; x< playerHand.length; x++){
            playerHand[x].printInfo();
        }
        if(cardTotal >=15){
            isHit = true;
        }
        System.out.println(name + ", your total is " + cardTotal +
                ". It is " + isBust + " that you are bust. It is " + isHit + " that you should hit.");
    }

    //todo: make a method called  calculateTotal

    public void calculateTotal(){
     //   cardTotal = playerHand[1].cardValue + playerHand[0].cardValue;
        int addValue = 0;
        for (int d = 0; d< playerHand.length; d++){
     //    cardTotal = cardTotal + playerHand[d].cardValue;
            addValue = addValue + playerHand[d].cardValue;
        }
        cardTotal = addValue;
    }

}

