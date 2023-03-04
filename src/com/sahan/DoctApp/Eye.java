package com.sahan.DoctApp;

public class Eye extends Organ{
    String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }
    public void eyeClose(){
        System.out.println(this.name + " Closed");
    }

    @Override
    public void getOrgan() {
        super.getOrgan();
        System.out.println("Colour: " + this.color);
    }
}
