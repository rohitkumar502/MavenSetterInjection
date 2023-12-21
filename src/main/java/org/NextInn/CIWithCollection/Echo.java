package org.NextInn.CIWithCollection;

import java.util.*;

public class Echo {
    private List<String> cars;
    private Set<String> fruits;
    private Map<String, String> bikes;
    private Properties props;


    public Echo(List<String> cars, Set<String> fruits, Map<String, String> bikes, Properties props)
    {
            this.cars = cars;
            this.fruits = fruits;
            this.bikes = bikes;
            this.props = props;
    }

    @Override
    public String toString() {
        return   "cars = " + cars + ", fruits=" + fruits + ", bikes=" + bikes + ", props=" + props ;
    }


}
