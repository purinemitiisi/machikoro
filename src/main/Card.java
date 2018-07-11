package main;

public enum Card {
	WHEAT_FIRLD   	           (Color.BLUE , Type.WHEAT  , 1, 1,  1),
	RANCH		  	           (Color.BLUE , Type.COW    , 1, 1,  2),
	FOREST		  	           (Color.BLUE , Type.GEAR   , 3, 1,  5),
	MINE		  	           (Color.BLUE , Type.GEAR   , 6, 5,  9),
	APPLE_ORCHARD 	           (Color.BLUE , Type.GEAR   , 3, 3, 10),
	BAKERY		  	           (Color.GREEN, Type.SHOP   , 1, 1,  2,  3),
	CONVENIENCE_STORE          (Color.GREEN, Type.SHOP   , 2, 3,  4),
	CHEESE_FACTORY             (Color.GREEN, Type.FACTORY, 5, 0,  7) {
		@Override
		int earn(GameState gs) {
			return gs.turnPlayer.getNum(Type.COW);
		}
	},
	FURNITURE_FACTORY          (Color.GREEN, Type.FACTORY, 3, 0,  8) {
		@Override
		int earn(GameState gs) {
			return gs.turnPlayer.getNum(Type.GEAR);
		}

	},
	FRUIT_AND_VEGETABLE_MARKET (Color.GREEN, Type.FRUIT  , 2, 0, 11, 12) {
		@Override
		int earn(GameState gs) {
			return gs.turnPlayer.getNum(Type.WHEAT);
		}

	},
	CAFE					   (Color.RED  , Type.CAFE   , 2, 1,  3),
	FAMILY_RESTAURANT		   (Color.RED  , Type.CAFE   , 3, 2,  9, 10);

	Color color;
	Type type;
	int cost;
	int earn;
	int minDice;
	int maxDice;

	Card(Color c, Type t,int cost, int earn, int min, int max) {
		this.color 	 = c;
		this.type 	 = t;
		this.earn    = earn;
		this.cost 	 = cost;
		this.minDice = min;
		this.maxDice = max;
	}

	Card(Color c, Type t,int cost, int earn,int dice) {
		this(c, t, cost, earn, dice, dice);
	}

	int earn(GameState gs){
		return earn;
	}
}
