package com.md;

public class User {//depentent element is User who is dependent upon gps

	int model;
	double price;
	String colour;
	GPS gps;//dependency
	
	public void showRoute() {
		
		gps.showRoute();
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public GPS getGps() {
		return gps;
	}

	public void setGps(GPS gps) {
		this.gps = gps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((gps == null) ? 0 : gps.hashCode());
		result = prime * result + model;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (gps == null) {
			if (other.gps != null)
				return false;
		} else if (!gps.equals(other.gps))
			return false;
		if (model != other.model)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [model=" + model + ", price=" + price + ", colour=" + colour + ", gps=" + gps + "]";
	}

	public User(int model, double price, String colour, GPS gps) {
		super();
		this.model = model;
		this.price = price;
		this.colour = colour;
		this.gps = gps;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
