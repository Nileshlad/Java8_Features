package com.method_referance;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {
    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
//----------------------------------------------------------------------------------
//Here we have passed System.out::println method as a static method reference.
//Method references help to point to methods by their names. A method reference is described using "::" symbol.
// A method reference can be used to point the following types of methods −
//
//       1. Static methods
//        2.Instance methods
//        3.Constructors using new operator (TreeSet::new)

//--------------------------------------------------------------------------------------------------------------------------------
//output
//Mahesh
//Suresh
//Ramesh
// Naresh
//Kalpesh
