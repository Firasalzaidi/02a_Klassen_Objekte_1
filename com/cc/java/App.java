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
        output(cat.tellYourName());
        output(cat.tellYourFurcolor());
        output(String.valueOf(cat.tellYourAge()));  //int --> String

        output("-------------");

        Cat cat2 = new Cat();
        output("Adresse des Objekts: " + cat2);

        // wertzuweisung
        cat2.name = "Grizabella";
        cat2.furcolor = "white";
        cat2.age = 29;
        
        // Ausgabe
        output(cat2.tellYourName());
        output(cat2.tellYourFurcolor());
        output(Integer.toString(cat2.tellYourAge())); // int --> String   


    }

   // static Methode --- in Klasse
    public static void output(String outputStr){
        System.out.println(outputStr);
    }




}

