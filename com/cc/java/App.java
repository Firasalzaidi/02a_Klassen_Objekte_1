package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // objekt entsteht ...
        Cat cat = new Cat(); // Instanzierung
        System.out.println(cat);

        // wertzuweisung
        cat.name = "Alonzo";
        cat.furcolor = "grey";
        cat.age = 35;

        // Ausgabe
        System.out.println(cat.name);
        System.out.println(cat.furcolor);
        System.out.println(cat.age);

        System.out.println(("-------------"));

        Cat cat2 = new Cat();
        System.out.println(cat2);

        // wertzuweisung
        cat.name = "Grizabella";
        cat.furcolor = "white";
        cat.age = 29;
        
        // Ausgabe
        System.out.println(cat.name);
        System.out.println(cat.furcolor);
        System.out.println(cat.age);
        

    }

   

}

