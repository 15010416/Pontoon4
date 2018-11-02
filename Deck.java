package Pontoon;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private final LinkedList<Cards> deck = new LinkedList<Cards>();

    public Deck()
    {
        for(CardSuit family : CardSuit.values())
            for(CardFace value : CardFace.values())
                deck.add(new Cards(family, value));
    }

    public Cards deal()
    {
        return deck.poll();
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public String toString() {
        return deck.toString();
    }
}
