package org.NextInn.gfg;
public class Employee {
    private String name;
    private int id;

    // Address is another bean containing employee's address information.
    private Address address;

    public Employee( String name, int id, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

}

