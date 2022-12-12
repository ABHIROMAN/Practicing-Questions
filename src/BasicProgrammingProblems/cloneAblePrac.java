package BasicProgrammingProblems;

import java.util.*;

class Customer implements Comparable<Customer> {

    String name;
    int billAmt;

    public Customer(String n, int b) {
        name = n;
        billAmt = b;
    }
    public String getName() {
        return name;
    }
    public int getBill() {
        return billAmt;
    }

    public String.toString() {
        return name;
    }

    public int compareTo(Customer obj) {


    }
}

public class cloneAblePrac {
}