package org.NextInn.autowire;
public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting value...");
        this.address = address;
    }

    public Emp() {

    }

    public Emp(Address address) {
        this.address = address;
        System.out.println("Constructor called..");
    }

    @Override
    public String toString() {
        return "Emp [ address = " + address + ']';
    }


}
