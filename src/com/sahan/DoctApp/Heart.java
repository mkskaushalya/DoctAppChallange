package com.sahan.DoctApp;

import java.util.Scanner;

public class Heart extends Organ{
    int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    public void setHeartRate() {
        System.out.print("Enter the new heart rate: ");
        Scanner scanner = new Scanner(System.in);
        int heartRate = scanner.nextInt();
        this.heartRate = heartRate;
        System.out.println("Heart rate changed to: " + heartRate);
    }

    @Override
    public void getOrgan() {
        super.getOrgan();
        System.out.println("Heart rate: " + this.heartRate);
    }
}
