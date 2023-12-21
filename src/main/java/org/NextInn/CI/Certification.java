package org.NextInn.CI;

public class Certification {
	private String certificationName;
	private int price;
	public Certification(String certificationName, int price){
		this.certificationName = certificationName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "{ certificationName = " + certificationName + ", price = " + price +" }" ;
	}
}