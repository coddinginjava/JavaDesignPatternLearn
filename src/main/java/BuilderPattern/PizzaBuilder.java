package BuilderPattern;

public class PizzaBuilder {

	public static class Builder {

		private String base;
		private String sauce;
		private String topppings;
		private String vegges;

		public Builder() {
		}

		public PizzaBuilder build() {
			return new PizzaBuilder(this);
		}

		public Builder base(String base) {
			this.base = base;
			return this;
		}

		public Builder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public Builder topppings(String topppings) {
			this.topppings = topppings;
			return this;
		}

		public Builder vegges(String vegges) {
			this.vegges = vegges;
			return this;
		}

	}

	private final String base;
	private final String sauce;
	private final String topppings;
	private final String vegges;

	public PizzaBuilder(Builder builder) {
		this.base = builder.base;
		this.sauce = builder.sauce;
		this.topppings = builder.topppings;
		this.vegges = builder.vegges;
	}

	public String getBase() {
		return base;
	}

	public String getSauce() {
		return sauce;
	}

	public String getTopppings() {
		return topppings;
	}

	public String getVegges() {
		return vegges;
	}

}
