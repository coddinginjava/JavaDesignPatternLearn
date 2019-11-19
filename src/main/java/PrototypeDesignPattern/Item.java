package PrototypeDesignPattern;

public abstract class Item implements Cloneable {

	private String title;
	private String url;
	private double rate;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
