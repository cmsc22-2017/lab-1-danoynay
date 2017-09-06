interface IMenu {}

class Soup implements IMenu{
	Item define;
	boolean isVegetarian;
	
	Soup(Item define, boolean isVegetarian){
		this.define = define;
		this.isVegetarian = isVegetarian;
	}
}


class Salad implements IMenu{
	Item define;
	boolean isVegetarian;
	String dressing;
	
	Salad(Item define, boolean isVegetarian, String dressing){
		this.define = define;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;
	}
}

class Sandwich implements IMenu{
	Item define;
	String bread;
	Filling fill;
	
	Sandwich(Item define, String bread, Filling fill){
		this.define = define;
		this.bread = bread;
		this.fill = fill;
	}
}

class Item{
	String name;
	int price;
	
	Item(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class Filling{
	String fill1;
	String fill2;
	
	Filling(String fill1, String fill2){
		this.fill1 = fill1;
		this.fill2 = fill2;
	}
}

class ExamplesMenu {
	ExamplesMenu(){}
		//Soup
		Item s = new Item("Manok", 200);
		Soup manok = new Soup(s, false);
		Item s1 = new Item("Talong", 30);
		Soup talong = new Soup(s1, true);		
		
		//Salad
		Item t = new Item("Vegetable", 500);
		Salad vegetable = new Salad(t, true, "Vinegar");
		Item t1 = new Item("Caesar", 400);
		Salad Caesar = new Salad(t1, false, "Cheese");
		
		//Sandwich
		Item u = new Item("Egg", 20);
		Filling f = new Filling("Butter", "Bacon");
		Sandwich egg = new Sandwich(u, "Wheat", f);
		Item u1 = new Item("Pabebe", 30);
		Filling f1 = new Filling("Mayonaise", "berry");
		Sandwich Pabebe = new Sandwich(u1, "Pabebe", f1);
		
}