package com.sahan.DoctApp;

import java.util.Scanner;

public class Pations {
    String name;
    public Eye leftEye, rightEye;
    public Heart heart;
    public Skin skin;
    public Stomach stomach;
    int age;

    public void setLeftEye(String name, String doc, String color) {
        Eye leftEye = new Eye(name, doc, color);
        this.leftEye = leftEye;
    }

    public void setRightEye(String name, String doc, String color) {
        Eye rightEye = new Eye(name, doc, color);
        this.rightEye = rightEye;
    }

    public void setHeart(String name, String doc, int heartRate) {
        Heart heart = new Heart(name, doc, heartRate);
        this.heart = heart;
    }

    public void setSkin(String name, String doc) {
        Skin skin = new Skin(name, doc);
        this.skin = skin;
    }

    public void setStomach(String name, String doc, boolean isDigest) {
        Stomach stomach = new Stomach(name, doc, isDigest);
        this.stomach = stomach;
    }

    public Pations(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void startApp(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        this.chooseOrgan();

    }

    private void chooseOrgan(){
        boolean q = true;
        while(q == true){
            System.out.println("Choose an Organ:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            int option = scanner.nextInt();
            if (option == 1){
                this.leftEye.getOrgan();
                System.out.println("\t\t1. Close Eye");
                int close = scanner.nextInt();
                if (close == 1){
                    this.leftEye.eyeClose();
                }
            }else if (option == 2) {
                this.rightEye.getOrgan();
                System.out.println("\t\t1. Close Eye");
                int close = scanner.nextInt();
                if (close == 1){
                    this.rightEye.eyeClose();
                }
            }else if (option == 3) {
                this.heart.getOrgan();
                System.out.println("\t\t1. Change the heart rate");
                int change = scanner.nextInt();
                if (change == 1){
                    this.heart.setHeartRate();
                }
            }else if (option == 4) {
                this.stomach.getOrgan();
                System.out.println("\t\t1. Digest");
                int fed = scanner.nextInt();
                if (fed == 1){
                    this.stomach.setStomach();
                }
            }else if (option == 5) {
                this.skin.getOrgan();
            }else if (option == 6) {
                break;
            }

        }

    }

//    public void leftEye(Eye eye){
//        this.leftEye = eye;
//    }
//    public void rightEye(Eye eye){
//        this.rightEye = eye;
//    }
//
//    public void heart(Heart heart){
//        this.heart = heart;
//    }
//    public void skin(Skin skin){
//        this.skin = skin;
//    }
//    public void stomach(Stomach stomach){
//        this.stomach = stomach;
//    }


}
