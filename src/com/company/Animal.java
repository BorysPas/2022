package com.company;

import javax.xml.bind.annotation.XmlType;

public class Animal {
    String species;
    Double weight;
    Integer age;
    String name;
    Boolean isAlive;

    public Animal(String species){
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species){
            case "felis":this,weight = 5.0; break;
            case "canis":this,weight = 10.0; break;
            default: this.weight = 5.0; break;
        }
    }

    void feed(){
        if (isAlive){
            weight +=1;
            System.out.println("thx for food");
        }else {
            System.out.println("Troche nie zyje");
        }
    }

    void takeForAWalk(){
        if (isAlive) {
            weight -=1;
            System.out.println("Nice walk, thx");
            }
        else {
            System.out.println("Umieram, r-r-r-r-r");
        }
    }
}
