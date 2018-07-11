package main;

import java.util.EnumMap;
import java.util.Map;

public class Player {
	private int coin;
	private Map<Card, Integer> cardNumMap;

	Player() {
		cardNumMap = new EnumMap<Card, Integer>(Card.class);
		cardNumMap.put(Card.WHEAT_FIRLD, 1);
		cardNumMap.put(Card.BAKERY,      1);
	}

	public void addCard(Card c) {
		if (!cardNumMap.containsKey(c)) {
			cardNumMap.put(c, 1);
		}
		cardNumMap.put(c, cardNumMap.get(c)+1);
	}

	public int getNum(Card c) {
		return cardNumMap.getOrDefault(c,0);
	}

	public int getNum(Type t) {
		return cardNumMap.getOrDefault(t,0);
	}


}
