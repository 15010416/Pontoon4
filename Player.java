package Pontoon;

import java.util.ArrayList;

public abstract class Player {

    private int nbrChips;
    private Hand playHand;

    public Player(int totalChips)
    {
        nbrChips = totalChips;
        playHand = new Hand();

    }

    public void setNbrChips(int nbrChips) {
        this.nbrChips = nbrChips;
    }

    public int getNbrChips() {
        return nbrChips;
    }

    public void setPlayHand(Hand playerHand) {
        this.playHand = playerHand;
    }

    public Hand getPlayHand(){
        return playHand;
    }

    /**
     * split
     */


    /**
     * twist
     * @Param twistCard card dealt
     */
    public void twist(Hand handInPlay, Cards twistCard)
    {
        handInPlay.addCard(handInPlay, twistCard);
        setPlayHand(handInPlay);
    }

}
