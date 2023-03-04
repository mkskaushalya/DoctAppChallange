package com.sahan.DoctApp;

import java.util.Scanner;

public class Stomach extends Organ{
    boolean isFed;

    public Stomach(String name, String medicalCondition, boolean isFed) {
        super(name, medicalCondition);
        this.isFed = isFed;
    }

    public void setStomach() {
            if (isFed){
                this.isFed = true;
                System.out.println("Digesting begin...");

            }else{
                this.isFed = false;
                System.out.println("Digesting feeding...");
            }
    }

    @Override
    public void getOrgan() {
        super.getOrgan();
        if (isFed){
            System.out.println("Need to be fed");
        }else{
            System.out.println("Need to be unfed");
        }
    }


}
