package Pontoon;

import java.util.ArrayList;

public class GamePlay {

	private ArrayList<Punter> player;
	
	public GamePlay ()
    {
        player = new ArrayList<Punter>();
    }
	
	Punter player1 = new Punter("Rachael");
	Punter player2 = new Punter("Matt");
	Punter player3 = new Punter("Calum");
	
	
	player1.twist(player1.getPlayHand(),pontoonDeck.deal());
    player1.twist(player1.getPlayHand(),pontoonDeck.deal());
    
    player2.twist(player2.getPlayHand(),pontoonDeck.deal());
    player2.twist(player2.getPlayHand(),pontoonDeck.deal());
    
    player3.twist(player3.getPlayHand(),pontoonDeck.deal());
    player3.twist(player3.getPlayHand(),pontoonDeck.deal());
	
	
}
