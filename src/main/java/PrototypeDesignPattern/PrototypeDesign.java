package PrototypeDesignPattern;

public class PrototypeDesign {

	public static void main(String[] args) {
		Registry registry = new Registry();
		registry.loadTheItem();

		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Dragon boster");

		printItOut(movie);

		Movie anothermovie = (Movie) registry.createItem("Movie");
		anothermovie.setTitle("Pokemon");

		printItOut(anothermovie);
	}

	private static void printItOut(Movie movie) {

		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getRate());

	}

}
