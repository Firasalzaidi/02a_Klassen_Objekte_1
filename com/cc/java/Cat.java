package com.cc.java;

public class Cat {

   String name;     // Primitives
   String furcolor; // Primitives
   int age;         // Primitives




public String tellYourName(){
    return this.name;
}

public String tellYourFurcolor(){
    return this.furcolor;
}

public int tellYourAge(){
    return this.age;
}

public void tellYourAddress(){
    System.out.println(this);
}

}
