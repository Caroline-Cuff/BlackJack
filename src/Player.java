public class Player {


    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String name;
    public Card[] playerHand;

    public Player(){


    }

    public void printInfo(){
        System.out.println("These are your cards," + name + " : ");
        for (int x = 0; x< playerHand.length; x++){
            System.out.println(playerHand);
        }
        System.out.println("The dealer's total is " + cardTotal +
                "It is " + isBust + " that you are bust. It is " + isHit + " that you should hit.");
    }

}

