package com.company;

import java.util.Scanner;

public class Ques5 {

    float radius, pi, area;

    public Ques5(float a){
        radius = a;
        pi = 3.142f;
    }

    public void area(){
        area = pi * (radius*radius);
    }

    public void display(){
        System.out.println("Area: " + area);
    }

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = a.nextFloat();

        Ques5 obj = new Ques5(radius);

        obj.area();

        obj.display();
    }
}