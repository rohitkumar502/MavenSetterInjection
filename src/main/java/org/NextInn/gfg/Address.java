package org.NextInn.gfg;

public class Address {

    private String city;
    private long zipcode;

    public Address(String city, long zipcode) {
        super();
        this.city = city;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", zipcode=" + zipcode + "]";
    }

}