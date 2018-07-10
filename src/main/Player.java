package main;

import java.util.EnumMap;
import java.util.Map;

public abstract class Player {
	private int coin;
	private Map<Card, Integer> cardNum;

	Player() {
		cardNum = new EnumMap<Card, Integer>(Card.class);
		cardNum.put(Card.WHEAT_FIRLD, 1);
		cardNum.put(Card.BAKERY,      1);
	}

	public void addCard(Card c) {
		if (!cardNum.containsKey(c)) {
			cardNum.put(c, 1);
		}
		cardNum.put(c, cardNum.get(c)+1);
	}


}
