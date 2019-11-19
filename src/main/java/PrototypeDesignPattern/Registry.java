package PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Registry() {

		loadTheItem();
	}

	public void loadTheItem() {
		Movie m = new Movie();
		m.setRate(500);
		m.setRuntime("3hrs");
		m.setTitle("Harry potter");

		items.put("Movie", m);

		Book b = new Book();
		b.setTitle("Tale of two cities");
		b.setRate(150);
		b.setNoofpages("5000");

		items.put("Book", b);

	}

	public Item createItem(String entry) {
		Item item = null;

		try {
			item = (Item) (items.get(entry).clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return item;
	}
}
