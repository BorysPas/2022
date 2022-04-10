package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    Car car;
    private Double salary;

    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car) {
        if(this.salary > car.value) {
            System.out.println("gratuluje");
            this.car = car;
        }
    }

    public Double getSalary(){
        System.out.println("Dane"+ java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0){
            System.out.println("niemozliwe")
        }else {
            System.out.println("nowa wyplata")
            this.salary = salary;
        }
    }
}
