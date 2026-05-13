public class Card {

    //todo: make a constructor w 3 parameters

    public int cardValue;
    public String cardName;
    public String suit;

    public Card(int cardValue2, int cardName2, int suit2){
        cardValue = cardValue2;
        if (cardName2 == 0){
            cardName = "Ace";
            cardValue = 11;
        }
        else if (cardName2 == 1){
            cardName = "two";
            cardValue = 2;
        }else if (cardName2 == 2){
            cardName = "three";
            cardValue = 3;
        }
        else if (cardName2 == 3){
            cardName = "four";
            cardValue = 4;
        }
        else if (cardName2 == 4){
            cardName = "five";
            cardValue = 5;
        }
        else if (cardName2 == 5){
            cardName = "six";
            cardValue = 6;
        }
        else if (cardName2 == 6){
            cardName = "seven";
            cardValue = 7;
        }
        else if (cardName2 == 7){
            cardName = "eight";
            cardValue = 8;
        }
        else if (cardName2 == 8){
            cardName = "nine";
            cardValue = 9;
        }
        else if (cardName2 == 9){
            cardName = "ten";
            cardValue = 10;
        }
        else if (cardName2 == 10){
            cardName = "Jack";
            cardValue = 10;
        }
        else if (cardName2 == 11){
            cardName = "Queen";
            cardValue = 10;
        }
        else if (cardName2 == 12){
            cardName = "King";
            cardValue = 10;
        }

        if (suit2  ==0 ){
            suit = "Hearts";
        }
        else if (suit2 == 1) {
            suit = "Clubs";
        }
        else if (suit2 == 2){
            suit = "Spades";
        }
        else if (suit2 == 3){
            suit = "Diamonds";
        }

    }

    // todo make a print info method that prints the card info

    public void printInfo(){
        System.out.println("The " + cardName + " of " + suit + " is worth " + cardValue + " points.");

    }

}
