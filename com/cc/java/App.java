package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // objekt entsteht ...
        Cat cat = new Cat("Alonzo", "grey" , 35); // Instanzierung
        
        // Ausgabe
        output(cat.tellYourName());
        output(cat.tellYourFurcolor());
        output(String.valueOf(cat.tellYourAge()));  //int --> String

        output("-------------");

        Cat cat2 = new Cat("Grizabella", "white" , 29); // Instanzierung
        output("Adresse des Objekts: " + cat2);

        
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

