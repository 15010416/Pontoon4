package Pontoon;

public class Cards {
    private final CardSuit suit;
    private final CardFace faceValue;

    public Cards(CardSuit family, CardFace value)
    {
        suit = family;
        faceValue = value;
    }

    public String toString() {
        return faceValue +  " of " + suit;
    }
}