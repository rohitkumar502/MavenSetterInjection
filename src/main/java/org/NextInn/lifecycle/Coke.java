package org.NextInn.lifecycle;


public class Coke {
    private String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Coke [ " + "flavour = " + flavour + ']';

    }

    public void start()
    {
        System.out.println("Starting method");
    }


    public void end()
    {
        System.out.println("ending method");
    }
}
