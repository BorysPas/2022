package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog= new Animal();
    dog.species = "canis";
    dog.isAlive = true;
    dog.name = "Bobik";
    dog.weight = 1.0;

    System.out.println(dog.name);
    System.out.println("spiecies:" + dog.species + "  name:" + dog.name);

    dog.feed();
    dog.feed();
    System.out.println(dog.weight);

    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();
    dog.takeForAWalk();

    System.out.println(dog.weight);

    Phone nokia = new Phone();
    nokia.producent = "nokia";
    nokia.model = "3310";
    nokia.screenSize = 3.0;
    nokia.os = "android";

    System.out.println(nokia.producent+ " " + nokia.model);
    System.out.println("Ekran " + nokia.screenSize + "  Os:" + nokia.os);

    Phone simens = new Phone();
    simens.producent = "simens";
    simens.model = "2560";
    simens.screenSize = 2.0;
    simens.os = "android";

    System.out.println(simens.producent+ " " + simens.model);
    System.out.println("Ekran " + simens.screenSize + "  Os:" + simens.os);


    Human Borys = new Human();
    Borys.firstName = "Borys";
    Borys.lastName = "P";
    Borys.pet = dog;
    Borys.mobile = nokia;


    }
}
