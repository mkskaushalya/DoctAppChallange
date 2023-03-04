package com.sahan.DoctApp;

public class Organ {
    String name, medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }
    public void getOrgan(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.medicalCondition);
    }
}
