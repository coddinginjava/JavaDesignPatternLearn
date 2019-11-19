package BuilderPattern;

public class BuilderDemo {

	public static void main(String[] args) {

		PizzaBuilder.Builder builder = new PizzaBuilder.Builder();

		builder.base("wheat").topppings("chese").sauce("sweat onion").vegges("onion");

		PizzaBuilder pizza = builder.build();

		System.out.println(pizza.getBase());
		System.out.println(pizza.getTopppings());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getVegges());

	}

}
