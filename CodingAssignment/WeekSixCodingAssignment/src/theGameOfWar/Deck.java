package theGameOfWar;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Cards> deckOfCards; 
	
	public Deck() {
		deckOfCards = new ArrayList<Cards>(); 
		
		for(int suit = 0; suit <=3; suit++) {
			for (int value = 2; value <= 14; value++) {
				deckOfCards.add(new Cards(value, suit));  
			}
		}	
	}
	public void print() {
		for (int i = 0; i<this.deckOfCards.size(); i++) {
			System.out.println(this.deckOfCards.get(i)); 
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	
	}
	public int length() {
		int x = deckOfCards.size(); 
		return x; 
	}
	
	public Cards draw() {
		Cards topCard = deckOfCards.get(0);
		deckOfCards.remove(0); 
		return topCard; 
	}
	
	
	public void dealDeck (Player x, Deck z) {
		x.addToHand(z);
	}	

}
