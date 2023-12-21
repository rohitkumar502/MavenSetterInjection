package org.NextInn.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsico implements InitializingBean, DisposableBean
{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsico [" + "price= " + price + ']';
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        // this method is equivalent to init()
        System.out.println("Taking Pepsi: init");
    }

    @Override
    public void destroy() throws Exception {
        // This is destroy method.
        System.out.println("Going to put bottle in the trash: destroy");
    }
}
