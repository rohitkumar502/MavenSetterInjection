package org.NextInn.ambiguityCI;

public class Addition {
    private int a, b;

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int)b;
        System.out.println("Constructor: double, double");

    }

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor: int, int");
    }

    //  Constructor which contain at least one String type parameter will  always execute by default (ordering doesn't matter)
    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor: String, String");
    }
    public Addition(String a, int b) {
        this.a = Integer.parseInt(a);
        this.b = b;
        System.out.println("Constructor: String, int");

    }
    public void doSum()
    {
        System.out.println("Sum = "+ (a+b) );
    }


}
