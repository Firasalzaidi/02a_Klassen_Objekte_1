package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // objekt erzeugen
        Cat cat = new Cat("Alonzo", "grey" , 35); // Instanzierung
        
        // Ausgabe
        output(cat.getName());
        output(cat.getFurcolor());
        output(String.valueOf(cat.getAge()));  //int --> String


        output("-------------");
        Cat cat2 = new Cat("Grizabella", "white" , 29); // Instanzierung


        // Ausgabe
        output(cat2.getName());
        output(cat2.getFurcolor());
        output(Integer.toString(cat2.getAge())); // int --> String   

    }

   // static Methode --- in Klasse
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

