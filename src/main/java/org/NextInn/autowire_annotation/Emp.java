package org.NextInn.autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    // Apply annotation on property. It uses type annotation internally.
//    @Autowired
//    @Qualifier("address2")
    private Address address;



    // Apply annotation on setter method.
//    @Autowired
//    @Qualifier("address1")
//    public void setAddress(Address address) {
//        System.out.println("Setting value...");
//        this.address = address;
//    }


    public Emp() { }

        // Apply annotation on constructor.
    @Autowired
    public Emp(@Qualifier("address2") Address address) {
        this.address = address;
        System.out.println("Constructor called..");
    }


    public String toString() {
        return "Emp [ address = " + address + ']';
    }


}
